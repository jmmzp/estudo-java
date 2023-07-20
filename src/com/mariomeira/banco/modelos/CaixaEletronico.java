package com.mariomeira.banco.modelos;

import com.mariomeira.banco.modelos.pagamento.DocumentoPagavel;

public class CaixaEletronico {

    public void imprimirExtrato(Conta conta){
        System.out.println("Ag: " + conta.getAgencia() + " / " + "Num: " + conta.getNumero());
        System.out.println("Titular: " + conta.getPessoa().getNome());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Saldo disponível : " + conta.getSaldoDisponivel());

    }

    public void pagarBoleto(DocumentoPagavel documento, Conta pagador) {
        if(documento.estaPago()){
            throw new IllegalStateException("Este documento já está pago.");
        }

        pagador.sacar(documento.getValor());
        documento.quitarPagamento();
}
