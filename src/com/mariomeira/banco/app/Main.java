package com.mariomeira.banco.app;

import com.mariomeira.banco.modelos.*;
import com.mariomeira.banco.modelos.pagamento.Boleto;
import com.mariomeira.banco.modelos.pagamento.DocumentoPagavel;

public class Main {
    public static void main(String[] args) {
        Pessoa titular1 = new Pessoa("Jose Mario", "09876543210");
        Pessoa titular2 = new Pessoa("Maria Jose", "09876543220");

        ContaInvestimento minhaConta = new ContaInvestimento(titular1, 123, 7765);
        ContaEspecial suaConta = new ContaEspecial(titular2, 123, 7765, 1_000);

        CaixaEletronico caixa = new CaixaEletronico();

        Boleto boletoInternet = new Boleto(suaConta, 1_000);

        minhaConta.depositar(20_000_000);
        caixa.imprimirExtrato(suaConta);
        System.out.println();

        caixa.pagarBoleto(boletoInternet, minhaConta);
        caixa.imprimirExtrato(minhaConta);
        System.out.println();

        caixa.imprimirExtrato(suaConta);

    }
}
