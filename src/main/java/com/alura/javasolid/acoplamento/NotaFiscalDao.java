package com.alura.javasolid.acoplamento;

/**
 * Created by MarcosNami on 10/6/2017.
 */
public class NotaFiscalDao implements AcaoAposGerarNota {
    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("Salva nf no banco " + nf.getId());
    }
}
