package com.mariomeira.banco.modelos;

import java.util.Objects;

public class Conta {

    private Pessoa pessoa;
    private int agencia;
    private int numero;
    private int saldo;

    public Conta(Pessoa pessoa, int agencia, int numero) {
        Objects.requireNonNull(pessoa);

        this.pessoa = pessoa;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0;
    }

    public void depositar(int valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de depósito deve ser maior que zero.");
        }

        saldo += valor;
    }

    public void sacar(int valor) {
        if (saldo - valor < 0) {
            throw new IllegalStateException("Saldo insuficiente.");
        }

        saldo -= valor;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public int getSaldo() {
        return saldo;
    }

}
