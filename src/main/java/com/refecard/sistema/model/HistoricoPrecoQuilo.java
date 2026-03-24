package com.refecard.sistema.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Data
@Entity
public class HistoricoPrecoQuilo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double valorQuilo;

    private LocalDateTime dataAtualizacao;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    @JsonBackReference("produto-historicoPrecoQuilo")
    private Produto produto;
}