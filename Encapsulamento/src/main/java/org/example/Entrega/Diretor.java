package org.example.Entrega;

public class Diretor extends Funcionario implements Contratacao {
    @Override
    public String admitir(Funcionario funcionario) {
        return "";
    }

    @Override
    public String demitir(Funcionario funcionario) {
        return "";
    }

    private double premio;

    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase, double premio) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
        this.premio = premio;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "premio=" + premio +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
