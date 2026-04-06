package com.nika.GerenciamentoDeAutores.model;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "Autor")
@Table(name = "tg_autores")
public class AutorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NomeAutor")
    private String nome;

    @Column(name = "NacionalidadeAutor")
    private String nacionalidade;

    @Column(name = "DataNascimentoAutor")
    private LocalDate dataNascimento;

    @Enumerated(EnumType.STRING)
    @Column(name = "StatusAutor")
    private AutorEnum status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public AutorEnum getStatus() {
        return status;
    }

    public void setStatus(AutorEnum status) {
        this.status = status;
    }
}
