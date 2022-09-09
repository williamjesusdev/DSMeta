package io.github.williamjesusdev.dsmeta.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.github.williamjesusdev.dsmeta.domain.models.Sale;
import io.github.williamjesusdev.dsmeta.domain.services.SalesService;
import io.github.williamjesusdev.dsmeta.domain.services.SmsService;

@RestController
@RequestMapping("sales")
public class SalesController {

  private SalesService salesService;
  private SmsService smsService;

  @Autowired
  public SalesController(SalesService salesService, SmsService smsService) {
    this.salesService = salesService;
    this.smsService = smsService;
  }

  @GetMapping
  public ResponseEntity<Page<Sale>> getAll(
      @RequestParam(value = "minDate", defaultValue = "") String minDate,
      @RequestParam(value = "maxDate", defaultValue = "") String maxDate,
      Pageable pageable) {

    Page<Sale> sales = salesService.findSales(minDate, maxDate, pageable);

    if (sales.isEmpty())
      return ResponseEntity.noContent().build();

    return ResponseEntity.ok(sales);
  }

  @GetMapping("/{saleId}/notification")
  public void notifyBySms(@PathVariable Long saleId) {
    smsService.sendSms(saleId);
  }

}
