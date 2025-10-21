package com.example.Spring.model;

import jakarta.persistence.*;

@Entity
@Table(name = "clientes")
public class ClienteModel {
    @Id @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,length = 100)
    private String nome;
    @Column(nullable = false,length = 100,unique = true)
    private String email;
    @Column(nullable = false,length = 100)
    private String telefone;
    @Column(nullable = false,length = 100)
    private String formaPagamento;
    @Column(nullable = false,length = 100)
    private String endereco;

    public ClienteModel() {
    }

    public ClienteModel(String email, Long id, String nome, String telefone, String formaPagamento, String endereco) {
        this.email = email;
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.formaPagamento = formaPagamento;
        this.endereco = endereco;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "ClienteModel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", formaPagamento='" + formaPagamento + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
