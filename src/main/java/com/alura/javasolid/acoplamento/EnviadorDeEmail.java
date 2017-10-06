package com.alura.javasolid.acoplamento;

/**
 * Created by MarcosNami on 10/6/2017.
 */
public class EnviadorDeEmail implements AcaoAposGerarNota {
    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("Envia email da nf " + nf.getId());
    }
}
