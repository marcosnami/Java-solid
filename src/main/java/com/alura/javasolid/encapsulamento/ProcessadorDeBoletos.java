package com.alura.javasolid.encapsulamento;

import java.util.List;

/**
 * Created by MarcosNami on 10/30/2017.
 */
public class ProcessadorDeBoletos {
    public void processa(List<Boleto> boletos, Fatura fatura) {

        for(Boleto boleto : boletos) {
            Pagamento pagamento = new Pagamento(boleto.getValor(), MeioDePagamento.BOLETO);
            fatura.adicionaPagamentos(pagamento);

        }

    }
}
