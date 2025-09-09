package org.example.AtividadeEntrega;

public class Motoboy extends Funcionario {
    private String placaDaMoto;

    public Motoboy(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String dataDeNascimento, String dataDeAdmissao, String placaDaMoto) {
        super(nome, cpf, rg, sexo, salarioBase, dataDeNascimento, dataDeAdmissao);
        this.placaDaMoto = placaDaMoto;
    }

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "placaDaMoto='" + placaDaMoto + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", sexo=" + sexo +
                ", salarioBase=" + salarioBase +
                ", SalarioFinal=" + this.getSalarioFinal() +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", dataDeAdmissao='" + dataDeAdmissao + '\'' +
                '}';
    }

    @Override
    public double getSalarioFinal() {
        return super.salarioBase;
    }





}
