package com.refecard.sistema.model;

import jakarta.persistence.*;
import lombok.Data;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Data
@Entity
public class ItemVenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double pesoOuQuantidade;

    private Double valorCobrado;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    @JsonBackReference("produto-itemVenda")
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "venda_id")
    @JsonBackReference("venda-itemVenda")
    private Venda venda;
}