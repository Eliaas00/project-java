package br.com.fecaf.model;

import java.util.Scanner;

public class Retangulo {
    //isso é um atributo
    public double lado1, lado2, area, perimetro;

    /* Instancia o Objeto Scanner */
    Scanner scanner = new Scanner(System.in);


    public boolean cadastrarRetangulo () {
        System.out.println("/******************************/");
        System.out.println("/*      Cadastro Retangulo    */");
        System.out.println("/******************************/");
        System.out.println(" Informe o lado1: ");
        lado1 = scanner.nextDouble();
        System.out.println(" Informe o lado2: ");
        lado2 = scanner.nextDouble();

        System.out.println("/******************************/");

        return true;
    }

    public void exibirRetangulo() {
        System.out.println("/*** Exibir Retangulo ***/");
        System.out.println("O lado 1 é igual a: " + lado1);
        System.out.println("O lado 2 é igual a: " + lado2);
        System.out.println("A area é igual a: " + area);
        System.out.println("O perimetro é igual a: " + perimetro);
        System.out.println("/******************************/");
    }

    public void calcularArea () {
        System.out.println("/*   Calcular Area    */");
        area = lado1 * lado2;
        System.out.println("A área é igual a: " + area);
    }

    public void calcularPerimetro () {
        System.out.println("/*  Calculando Perimetro */");
        perimetro = 2 * lado1 + 2 * lado2;
        System.out.println("O perimetro é igual a " + perimetro);
    }

    public boolean validarQuadrado () {
        System.out.println("/*  Definindo se é um quadrado:  */");


        if (lado1 == lado2) {
            System.out.println("É um quadrado");
            return true;
        }
        return false;
    }

}
