package org.example.AtividadeEntrega;


public class Diretor extends CargoDeConfianca implements Contratacao {
    private final double PREMIO = 1.1;

    public Diretor(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String dataDeNascimento, String dataDeAdmissao, Bonificacao bonificacao) {
        super(nome, cpf, rg, sexo, salarioBase, dataDeNascimento, dataDeAdmissao, bonificacao);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "PREMIO=" + PREMIO +
                ", bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
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
        return (super.salarioBase * Bonificacao.DIRETOR.getValor())
                * this.PREMIO;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitindo" + funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitindo" + funcionario.toString());

    }
}
