package com.refecard.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.refecard.sistema.model.RecargaSaldo;

public interface RecargaSaldoRepository extends JpaRepository<RecargaSaldo, Long> {
}