package com.example.Spring.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ClienteRequestDTO {

    @NotBlank(message = "O nome não pode estar em branco")
    @Size(min = 3,max = 100)
    private String nome;

    @NotBlank(message = "O email não pode estar em branco")
    @Email(message = "Email inválido")
    @Size(max = 100)
    private String email;

    @NotBlank(message = "O telefone não pode estar em branco")
    @Size(max = 11)
    private String telefone;

    @NotBlank(message = "A forma de pagamento não pode estar em branco")
    @Size(max = 100)
    private String formaPagamento;

    @NotBlank(message = "O endereço não pode estar em branco")
    @Size(max = 100)
    private String endereco;

    public ClienteRequestDTO() {
    }

    public ClienteRequestDTO(String nome, String email, String telefone, String formaPagamento, String endereco) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.formaPagamento = formaPagamento;
        this.endereco = endereco;
    }

    public @NotBlank(message = "O nome não pode estar em branco") @Size(min = 3, max = 100) String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome não pode estar em branco") @Size(min = 3, max = 100) String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "O email não pode estar em branco") @Email(message = "Email inválido") @Size(max = 100) String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "O email não pode estar em branco") @Email(message = "Email inválido") @Size(max = 100) String email) {
        this.email = email;
    }

    public @NotBlank(message = "O telefone não pode estar em branco") @Size(max = 11) String getTelefone() {
        return telefone;
    }

    public void setTelefone(@NotBlank(message = "O telefone não pode estar em branco") @Size(max = 11) String telefone) {
        this.telefone = telefone;
    }

    public @NotBlank(message = "A forma de pagamento não pode estar em branco") @Size(max = 100) String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(@NotBlank(message = "A forma de pagamento não pode estar em branco") @Size(max = 100) String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public @NotBlank(message = "O endereço não pode estar em branco") @Size(max = 100) String getEndereco() {
        return endereco;
    }

    public void setEndereco(@NotBlank(message = "O endereço não pode estar em branco") @Size(max = 100) String endereco) {
        this.endereco = endereco;
    }
}
