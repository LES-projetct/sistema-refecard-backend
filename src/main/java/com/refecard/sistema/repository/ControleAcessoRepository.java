package com.refecard.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.refecard.sistema.model.ControleAcesso;

public interface ControleAcessoRepository extends JpaRepository<ControleAcesso, Long> {
}