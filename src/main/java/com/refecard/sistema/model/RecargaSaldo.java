package com.refecard.sistema.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Data
@Entity
public class RecargaSaldo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double valorAdicionado;

    private LocalDateTime dataRecarga;

    @ManyToOne
    @JoinColumn(name = "cartao_id")
    @JsonBackReference("cartao-recargaSaldo")
    private Cartao cartao;
}