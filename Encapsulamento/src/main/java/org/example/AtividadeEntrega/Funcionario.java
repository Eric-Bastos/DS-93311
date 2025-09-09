package org.example.AtividadeEntrega;


public abstract class Funcionario implements SalarioFinal {
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Sexo sexo;
    protected double salarioBase;
    protected  String dataDeNascimento;
    protected String dataDeAdmissao;

    public Funcionario(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String dataDeNascimento, String dataDeAdmissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.salarioBase = salarioBase;
        this.dataDeNascimento = dataDeNascimento;
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public void setDataDeAdmissao(String dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", sexo=" + sexo +
                ", salarioBase=" + salarioBase +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", dataDeAdmissao='" + dataDeAdmissao + '\'' +
                '}';
    }

    @Override
    public double getSalarioFinal() {
        return 0;
    }
}
