package com.alura.javasolid.coesao;

/**
 * Created by MarcosNami on 10/5/2017.
 */
public enum Cargo {

    DESENVOLVEDOR(new DezOuVintePorCento()),
    DBA(new DezOuVintePorCento()),
    TESTER(new QuinzeOuVinteECincoPorCento());

    private RegraDeCalculo regraDeCalculo;

    Cargo(RegraDeCalculo regraDeCalculo) {
        this.regraDeCalculo = regraDeCalculo;
    }

    public RegraDeCalculo getRegraDeCalculo() {
        return regraDeCalculo;
    }
}
