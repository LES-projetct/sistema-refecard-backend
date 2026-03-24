package com.refecard.sistema.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.refecard.sistema.model.usuario.Usuario;

@Data
@Entity
public class Cartao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String codigoCartaoRfid;

    private Double limiteCredito;

    private Double saldo;

    private LocalDateTime dataUltimaCompra;

    private Boolean acessoBloqueado;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    @JsonBackReference("usuario-cartao")
    private Usuario usuario;

    @OneToMany(mappedBy = "cartao", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference("cartao-controleAcesso")
    private Set<ControleAcesso> acessos = new HashSet<>();

    @OneToMany(mappedBy = "cartao", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference("cartao-venda")
    private Set<Venda> vendas = new HashSet<>();

    @OneToMany(mappedBy = "cartao", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference("cartao-recargaSaldo")
    private Set<RecargaSaldo> recargas = new HashSet<>();

    @OneToMany(mappedBy = "cartao", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference("cartao-contaReceber")
    private Set<ContaReceber> contasReceber = new HashSet<>();
}
