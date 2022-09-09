package io.github.williamjesusdev.dsmeta.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.williamjesusdev.dsmeta.domain.models.Sale;

public interface SalesRepository extends JpaRepository<Sale, Long> {

}
