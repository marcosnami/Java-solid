package com.alura.javasolid.ocp;

/**
 * Created by MarcosNami on 10/30/2017.
 */
public class TabelaDePrecoPadrao implements TabelaDePreco {
    @Override
    public double descontoPara(double valor) {
        if(valor > 1000) return 0.05;
        if(valor > 5000) return 0.03;
        return 0;
    }
}
