package com.example.Spring.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ProdutoRequestDTO {

    @NotBlank(message = "O nome do produto não pode estar em branco")
    @Size(max = 100)
    private String nome;

    @NotBlank(message = "O lote não pode estar em branco")
    @Size(max = 100)
    private String lote;

    @NotBlank(message = "A validade não pode estar em branco")
    @Size(max = 100)
    private String validade;

    @NotBlank(message = "A categoria não pode estar em branco")
    @Size(max = 100)
    private String categoria;

    private int quantidade;

    public ProdutoRequestDTO() {
    }

    public ProdutoRequestDTO(String nome, String lote, String validade, String categoria, int quantidade) {
        this.nome = nome;
        this.lote = lote;
        this.validade = validade;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }

    public @NotBlank(message = "O nome do produto não pode estar em branco") @Size(max = 100) String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome do produto não pode estar em branco") @Size(max = 100) String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "O lote não pode estar em branco") @Size(max = 100) String getLote() {
        return lote;
    }

    public void setLote(@NotBlank(message = "O lote não pode estar em branco") @Size(max = 100) String lote) {
        this.lote = lote;
    }

    public @NotBlank(message = "A validade não pode estar em branco") @Size(max = 100) String getValidade() {
        return validade;
    }

    public void setValidade(@NotBlank(message = "A validade não pode estar em branco") @Size(max = 100) String validade) {
        this.validade = validade;
    }

    public @NotBlank(message = "A categoria não pode estar em branco") @Size(max = 100) String getCategoria() {
        return categoria;
    }

    public void setCategoria(@NotBlank(message = "A categoria não pode estar em branco") @Size(max = 100) String categoria) {
        this.categoria = categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
