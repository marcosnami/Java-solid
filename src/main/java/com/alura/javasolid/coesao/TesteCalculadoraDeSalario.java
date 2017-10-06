package com.alura.javasolid.coesao;

/**
 * Created by MarcosNami on 10/5/2017.
 */
public class TesteCalculadoraDeSalario {

    public static void main(String[] args) {

        CalculadoraDeSalario calculadoraDeSalario = new CalculadoraDeSalario();
        Funcionario funcionario  = new Funcionario();
        funcionario.setId(1);
        funcionario.setNome("Marcos");
        funcionario.setCargo(Cargo.DESENVOLVEDOR);
        funcionario.setSalarioBase(6000.00);

        System.out.println("Calculo: " + calculadoraDeSalario.calcula(funcionario));

    }
}
