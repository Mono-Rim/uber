package br.edu.ifsul.cstsi.uber.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "Motorista")
@Table(name = "motorista")
public class Motorista {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    @OneToOne @JoinColumn(name = "veiculo_id", referencedColumnName = "id", unique = true)
    private Veiculo veiculo;
    @OneToMany(mappedBy = "motorista")
    private List<Corrida> corridas;
}
