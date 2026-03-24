package com.refecard.sistema.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Data
@Entity
public class ContaPagar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double valorPagar;

    private LocalDate dataVencimento;

    private LocalDate dataPagamento;

    @ManyToOne
    @JoinColumn(name = "fornecedor_id")
    @JsonBackReference("fornecedor-contaPagar")
    private Fornecedor fornecedor;
}