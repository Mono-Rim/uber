package br.edu.ifsul.cstsi.uber.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "Corrida")
@Table(name = "corrida")
public class Corrida {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipoPagamento;
    private String detalhesPagamento;
    private Date dataInicio;
    private double preco;
    private int attribute9;
    @ManyToOne @JoinColumn(name = "Usuario_id", referencedColumnName = "id")
    private Usuario usuario;
    @ManyToOne @JoinColumn(name = "Motorista_id", referencedColumnName = "id")
    private Motorista motorista;
}
