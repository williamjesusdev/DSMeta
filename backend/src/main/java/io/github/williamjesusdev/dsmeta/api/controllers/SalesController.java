package io.github.williamjesusdev.dsmeta.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.williamjesusdev.dsmeta.domain.models.Sale;
import io.github.williamjesusdev.dsmeta.domain.services.SalesService;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("sales")
public class SalesController {

  private SalesService salesService;

  @Autowired
  public SalesController(SalesService salesService) {
    this.salesService = salesService;
  }

  @GetMapping
  public ResponseEntity<Page<Sale>> getAll(Pageable pageable) {
    Page<Sale> sales = salesService.findAll(pageable);
    if (sales.isEmpty()) {
      return ResponseEntity.noContent().build();
    }
    return ResponseEntity.ok(sales);
  }

}
