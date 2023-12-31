package br.edu.ifsul.cstsi.uber.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "Usuario")
@Table(name = "usuario")
public class Usuario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    @OneToMany(mappedBy = "usuario")
    private List<Corrida> corridas;
}
