package br.com.danielsantdev.animalservice.entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

    @Column(nullable = false)
    private String nomeProvisorio;

    @Column(nullable = false)
    private Integer idadeEstimada;

    @Column(nullable = false)
    private String raca;

    @Column(nullable = false)
    private Date dataEntrada;

    @Column
    private Date dataAdocao;

    @Column(nullable = false)
    private String condicoesChegada;

    @Column(nullable = false)
    private String nomeRecebedor;

    @Column
    private Date dataObito;

    @Column(nullable = false)
    private String porte;

}
