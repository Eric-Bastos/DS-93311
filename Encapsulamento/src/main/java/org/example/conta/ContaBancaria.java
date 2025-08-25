package org.example.conta;

public class ContaBancaria {
    private String banco;
    private String agencia;
    private String numeroConta;
    private String tipoConta;
    private String saldoatual;
    private String limitedisponivel;

    public ContaBancaria(String banco, String agencia, String numeroConta, String tipoConta, String saldoatual, String limitedisponivel) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.saldoatual = saldoatual;
        this.limitedisponivel = limitedisponivel;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getSaldoatual() {
        return saldoatual;
    }

    public void setSaldoatual(String saldoatual) {
        this.saldoatual = saldoatual;
    }

    public String getLimitedisponivel() {
        return limitedisponivel;
    }

    public void setLimitedisponivel(String limitedisponivel) {
        this.limitedisponivel = limitedisponivel;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "banco='" + banco + '\'' +
                ", agencia='" + agencia + '\'' +
                ", numeroConta='" + numeroConta + '\'' +
                ", tipoConta='" + tipoConta + '\'' +
                ", saldoatual='" + saldoatual + '\'' +
                ", limitedisponivel='" + limitedisponivel + '\'' +
                '}';
    }
}
