package com.refecard.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.refecard.sistema.model.ContaPagar;

public interface ContaPagarRepository extends JpaRepository<ContaPagar, Long> {
}