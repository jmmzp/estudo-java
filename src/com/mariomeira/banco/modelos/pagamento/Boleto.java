package com.mariomeira.banco.modelos.pagamento;

import com.mariomeira.banco.modelos.Conta;
import com.mariomeira.banco.modelos.Pessoa;

public class Boleto implements DocumentoPagavel {



    private Conta beneficiario;
    private int valor;
    private boolean pago;

    public Conta getBeneficiario() {
        return beneficiario;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public Boleto(Conta beneficiario, int valor) {
        this.beneficiario = beneficiario;
        this.valor = valor;
    }

    @Override
    public int getValor() {
        return valor;
    }

    @Override
    public boolean estaPago() {
        return pago;
    }

    @Override
    public void quitarPagamento() {
        setPago(true);
    }
}
