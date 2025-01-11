package com.israel.trabalhodevweb.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties("sessoes")
@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int anoLancamento;
    private String diretor;
    private String genero;
    private String descricao;
    private String trailer;
    private String image;
    private int nota;


    @ManyToOne
    // @JoinColumn(name = "CATEGORIA_ID")
    private Categoria categoria;

    @OneToMany(mappedBy = "produto")
    private List<Sessao> sessoes;

    public Produto(String nome, int anoLancamento, String diretor, String genero, String descricao, int nota, String trailer, String image, Categoria categoria) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.diretor = diretor;
        this.genero = genero;
        this.descricao = descricao;
        this.trailer = trailer;
        this.image = image;
        this.nota = nota;
        this.categoria = categoria;
    }
}

