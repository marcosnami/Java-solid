package com.alura.javasolid.heranca;

/**
 * Created by MarcosNami on 10/30/2017.
 */
public class ManipuladorDeSaldo {

    private double saldo;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        if(valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void rende(double taxa) {
        this.saldo *= taxa;
    }

}
