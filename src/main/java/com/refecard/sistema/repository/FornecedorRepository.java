package com.refecard.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.refecard.sistema.model.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
}