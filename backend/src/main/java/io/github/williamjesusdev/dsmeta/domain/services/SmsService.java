package io.github.williamjesusdev.dsmeta.domain.services;

import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import io.github.williamjesusdev.dsmeta.domain.models.Sale;
import io.github.williamjesusdev.dsmeta.domain.repositories.SalesRepository;

@Service
public class SmsService {

  @Value("${twilio.sid}")
  private String twilioSid;

  @Value("${twilio.key}")
  private String twilioKey;

  @Value("${twilio.phone.from}")
  private String twilioPhoneFrom;

  @Value("${twilio.phone.to}")
  private String twilioPhoneTo;

  private NumberFormat realFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
  private DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/YYYY");

  private SalesRepository salesRepository;

  @Autowired
  public SmsService(SalesRepository salesRepository) {
    this.salesRepository = salesRepository;
  }

  public void sendSms(Long saleId) {
    Optional<Sale> saleOptional = salesRepository.findById(saleId);

    if (saleOptional.isEmpty())
      throw new RuntimeException("sale not found!");

    StringBuilder msg = new StringBuilder();
    Sale sale = saleOptional.get();
    String date = sale.getDate().format(dateFormat);

    msg.append("O vendedor " + sale.getSellerName());
    msg.append(" foi destaque em " + date);
    msg.append(" com um total de R$ " + realFormat.format(sale.getAmount()));

    Twilio.init(twilioSid, twilioKey);

    PhoneNumber to = new PhoneNumber(twilioPhoneTo);
    PhoneNumber from = new PhoneNumber(twilioPhoneFrom);

    Message message = Message.creator(to, from, msg.toString()).create();

    System.out.println(message.getSid());
  }
}
