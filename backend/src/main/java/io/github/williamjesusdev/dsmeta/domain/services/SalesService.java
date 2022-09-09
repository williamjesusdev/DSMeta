package io.github.williamjesusdev.dsmeta.domain.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import io.github.williamjesusdev.dsmeta.domain.models.Sale;
import io.github.williamjesusdev.dsmeta.domain.repositories.SalesRepository;

@Service
public class SalesService {

  private SalesRepository salesRepository;

  @Autowired
  public SalesService(SalesRepository salesRepository) {
    this.salesRepository = salesRepository;
  }

  public Page<Sale> findSales(String minDate, String maxDate, Pageable pageable) {
    LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());

    LocalDate min = minDate.isEmpty() ? today.minusDays(365) : LocalDate.parse(minDate);
    LocalDate max = maxDate.isEmpty() ? today : LocalDate.parse(maxDate);

    if (min.isAfter(max)) {
      throw new RuntimeException("maxDate must be after the minDate!");
    }

    return salesRepository.findSales(min, max, pageable);
  }

}
