package com.mariomeira.banco.app;

import com.mariomeira.banco.modelos.Conta;
import com.mariomeira.banco.modelos.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa titular1 = new Pessoa("Jose Mario", "09876543210");
        Conta minhaConta = new Conta(titular1, 123, 7765);

        System.out.println("Nome: " + minhaConta.getPessoa().getNome());
        System.out.println("Agencia: " + minhaConta.getAgencia());
        System.out.println("Numero: " + minhaConta.getNumero());
        System.out.println("Saldo: " + minhaConta.getSaldo());

        minhaConta.depositar(1_000_000);
        System.out.println("Saldo apos deposito: " + minhaConta.getSaldo() / 100);

        minhaConta.sacar(100_000);
        System.out.println("Saldo apos saque: " + minhaConta.getSaldo() / 100);


    }
}
