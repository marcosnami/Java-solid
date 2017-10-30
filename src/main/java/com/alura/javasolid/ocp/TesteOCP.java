package com.alura.javasolid.ocp;

/**
 * Created by MarcosNami on 10/30/2017.
 */
public class TesteOCP {

    public static void main(String[] args) {
        ServicoDeEntrega servicoDeEntrega = new Frete();
        TabelaDePreco taelaDePreco = new TabelaDePrecoDiferenciada();
        CalculadoraDePrecos calculadoraDePrecos = new CalculadoraDePrecos(taelaDePreco, servicoDeEntrega);
        System.out.println(calculadoraDePrecos);
    }

}
