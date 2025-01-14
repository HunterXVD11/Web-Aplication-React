package com.israel.trabalhodevweb.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIgnoreProperties("ingressos")
public class Sessao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tituloFilme;

    private String horaInicio;

    private int tempoFilme;

    @OneToMany(mappedBy = "sessao")
    private List<Ingresso> ingressos;

    @ManyToOne  
    @JoinColumn(name = "filme_id")  
    private Produto produto;

    public Sessao(
            String tituloFilme,
            String horaInicio,
            int tempoFilme,
            Produto produto
    ){
        this.tituloFilme = tituloFilme;
        this.horaInicio = horaInicio;
        this.tempoFilme = tempoFilme;
        this.produto = produto;
        this.ingressos = new ArrayList<>();
    }

}
