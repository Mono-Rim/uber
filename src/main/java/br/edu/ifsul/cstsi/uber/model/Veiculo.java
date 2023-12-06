package br.edu.ifsul.cstsi.uber.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "Veiculo")
@Table(name = "veiculo")
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;
    private String placa;
    private Date anoFabricacao;
}
