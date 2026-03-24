package com.refecard.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.refecard.sistema.model.Venda;

public interface VendaRepository extends JpaRepository<Venda, Long> {
}