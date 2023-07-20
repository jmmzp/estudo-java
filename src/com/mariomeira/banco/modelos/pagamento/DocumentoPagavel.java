package com.mariomeira.banco.modelos.pagamento;

public interface DocumentoPagavel {
    int getValor();
    boolean estaPago();
    void quitarPagamento();


}
