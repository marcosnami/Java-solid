package com.alura.javasolid.acoplamento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MarcosNami on 10/6/2017.
 */
public class TesteGeradorDeNotaFiscal {

    public static void main(String[] args) {

        List<AcaoAposGerarNota> acoes = new ArrayList<>();
        acoes.add(new NotaFiscalDao());
        acoes.add(new EnviadorDeEmail());

        Fatura fatura = new Fatura(6000.00, "MH Webdesign");

        GeradorDeNotaFiscal gerador = new GeradorDeNotaFiscal(acoes);

        NotaFiscal nf = gerador.gera(fatura);

        System.out.println("Valor Liquido: " + nf.getValorLiquido());

    }
}
