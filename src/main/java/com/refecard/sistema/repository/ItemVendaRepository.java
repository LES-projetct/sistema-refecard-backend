package com.refecard.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.refecard.sistema.model.ItemVenda;

public interface ItemVendaRepository extends JpaRepository<ItemVenda, Long> {
}