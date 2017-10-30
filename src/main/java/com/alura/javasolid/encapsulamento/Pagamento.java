package com.alura.javasolid.encapsulamento;

/**
 * Created by MarcosNami on 10/30/2017.
 */
public class Pagamento {
    private double valor;
    private MeioDePagamento forma;

    public Pagamento(double valor, MeioDePagamento forma) {
        this.valor = valor;
        this.forma = forma;
    }

    public double getValor() {
        return valor;
    }

    public MeioDePagamento getForma() {
        return forma;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pagamento)) {
            return false;
        }
        Pagamento outro = (Pagamento) obj;
        if (forma != outro.forma
                || Double.doubleToLongBits(valor) != Double
                .doubleToLongBits(outro.valor)) {
            return false;
        }

        return true;
    }
}
