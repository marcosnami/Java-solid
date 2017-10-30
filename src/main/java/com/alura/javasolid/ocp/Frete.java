package com.alura.javasolid.ocp;

/**
 * Created by MarcosNami on 10/30/2017.
 */
public class Frete implements ServicoDeEntrega {
    @Override
    public double para(String cidade) {
        if("SAO PAULO".equals(cidade.toUpperCase())) {
            return 15;
        }
        return 30;
    }
}
