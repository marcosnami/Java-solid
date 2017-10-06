package com.alura.javasolid.coesao;

/**
 * Created by MarcosNami on 10/5/2017.
 */
public class QuinzeOuVinteECincoPorCento implements RegraDeCalculo {

    public double calcula(Funcionario funcionario) {
        if(funcionario.getSalarioBase() > 2000.0) {
            return funcionario.getSalarioBase() * 0.75;
        }
        else {
            return funcionario.getSalarioBase() * 0.85;
        }
    }

}
