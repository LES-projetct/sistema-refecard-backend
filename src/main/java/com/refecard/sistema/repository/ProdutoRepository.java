package com.refecard.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.refecard.sistema.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}