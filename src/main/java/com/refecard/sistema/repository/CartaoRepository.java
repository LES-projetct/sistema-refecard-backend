package com.refecard.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.refecard.sistema.model.Cartao;

public interface CartaoRepository extends JpaRepository<Cartao, Long> {
}