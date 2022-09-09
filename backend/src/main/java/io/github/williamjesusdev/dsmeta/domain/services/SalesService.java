package io.github.williamjesusdev.dsmeta.domain.services;

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

  public Page<Sale> findAll(Pageable pageable) {
    return salesRepository.findAll(pageable);
  }
}
