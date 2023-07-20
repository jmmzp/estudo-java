package com.mariomeira.banco.modelos;

public class ContaEspecial extends Conta {

    private int valorLimite;

    public ContaEspecial(Pessoa pessoa, int agencia, int numero, int valorLimite) {
        super(pessoa, agencia, numero);
        this.valorLimite = valorLimite;
    }

    public int getValorLimite() {
        return valorLimite;
    }

    public void setValorLimite(int valorLimite) {
        this.valorLimite = valorLimite;
    }

    @Override
    public void debitarTarifaMensal() {
        sacar(20);
    }

    @Override
    public int getSaldoDisponivel() {
        return getSaldo() + valorLimite;
    }
}
