package com.alura.javasolid.heranca;

/**
 * Created by MarcosNami on 10/30/2017.
 */
public class ContaDeEstudante extends ContaComum {

    private ManipuladorDeSaldo manipuladorDeSaldo;
    private int milhas;

    public ContaDeEstudante() {
        this.manipuladorDeSaldo = new ManipuladorDeSaldo();
    }

    public void deposita(double valor) {
        this.manipuladorDeSaldo.deposita(valor);
        this.milhas += (int)valor;
    }

    public int getMilhas()  {
        return this.milhas;
    }
}
