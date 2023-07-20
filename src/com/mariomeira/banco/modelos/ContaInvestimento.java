package com.mariomeira.banco.modelos;

public class ContaInvestimento extends Conta {

    public ContaInvestimento(Pessoa pessoa, int agencia, int numero) {
        super(pessoa, agencia, numero);
    }

    @Override
    public void debitarTarifaMensal() {
        if(getSaldo() < 10_000){
            sacar(30);
        }
    }

    public void creditarRendimentos(double percentualJuros) {
        double valorRendimentos = getSaldo() * percentualJuros / 100;
        depositar(valorRendimentos);
    }

}
