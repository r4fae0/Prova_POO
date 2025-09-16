package com.eliel.prova.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_ALUNO")
public class Estudante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(name = "Name")
    private String nome;
    @Column(name = "CaixaPostalVirtual")
    private String email;
    @Column(name = "Age")
    private Integer idade;

    public Estudante() {
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
