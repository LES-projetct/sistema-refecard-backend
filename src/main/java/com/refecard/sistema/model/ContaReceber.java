package com.refecard.sistema.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Data
@Entity
public class ContaReceber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double valorAberto;

    private LocalDate dataVencimento;

    private String statusPagamento;

    @ManyToOne
    @JoinColumn(name = "cartao_id")
    @JsonBackReference("cartao-contaReceber")
    private Cartao cartao;

    @OneToOne
    @JoinColumn(name = "venda_id")
    @JsonBackReference("venda-contaReceber")
    private Venda venda;
}