package com.alura.javasolid.heranca;

import java.util.Arrays;
import java.util.List;

/**
 * Created by MarcosNami on 10/30/2017.
 */
public class ProcessadorDeInvestimentos {

    public static void main(String[] args) {

        for (ContaComum conta : contasDoBanco()) {
            conta.rende();

            System.out.println("Novo Saldo:");
            System.out.println(conta.getSaldo());
        }

    }

    private static List<ContaComum> contasDoBanco() {
        return Arrays.asList(contaComum(200), contaComum(150), contaDeEstudante(300));
    }

    private static ContaComum contaDeEstudante(double amount) {
        ContaDeEstudante c = new ContaDeEstudante();
        c.deposita(amount);
        return c;
    }

    private static ContaComum contaComum(double amount) {
        ContaComum c = new ContaComum();
        c.deposita(amount);
        return c;
    }

}
