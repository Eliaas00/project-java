package br.com.fecaf.model;

import java.util.Arrays; // biblioteca e verifico o triângulo 3 4 5
import java.util.Scanner;

public class Triangulo {

    public double base, altura, lado2, lado3, area, perimetro;

    /* Instancia o Objeto Scanner */
    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarTriangulo () {
        System.out.println("/***********  *****************  **********/");
        System.out.println("/*             Cadastro Triângulo         */");
        System.out.println("/***********  *****************  **********/");
        System.out.println(" Informe a base");
        base = scanner.nextDouble();
        System.out.println(" Informe o lado2: ");
        lado2 = scanner.nextDouble();
        System.out.println(" Informe o lado3: ");
        lado3 = scanner.nextDouble();
        System.out.println(" Informe a altura: ");
        altura = scanner.nextDouble();

        return true;
    }


    public void calcularArea() {
        System.out.println("/**********************************************/");
        System.out.println("/*                Calculando Área             */");
        System.out.println("/**********************************************/");

        area = (base * altura) / 2;
        System.out.println("/* A Área do triângulo é igual a: " + area);
    }

    public void calcularPerimetro() {
        System.out.println("/**********************************************/");
        System.out.println("/*             Calculando Perimetro           */");
        System.out.println("/**********************************************/");

        perimetro = base + lado2 + lado3;
        System.out.println("/* O Perímetro do triângulo é igual a: " + perimetro);
    }

    public void definindoTriagulo345 () {
        System.out.println("/* * * * * * * * * * * * * * * * * * * * * * */");
        System.out.println("/*         Classificando Tipo - Ângulo        */");
        System.out.println("/* * * * * * * * * * * * * * * * * * * * * * */");

        // Aqui eu crio um array com a base e lados
        double[] ladoTriangulo = {base, lado2, lado3};
        Arrays.sort(ladoTriangulo); // estou ordenando o array

        // Criei essa verificação para ver se segue o padrão do triângulo 345
        if (ladoTriangulo[0] % 3 == 0 && ladoTriangulo[1] % 4 == 0 && ladoTriangulo[2] % 5 == 0) {
            System.out.println("Esse triângulo é 3 4 5 :)");
        } else {
            // Aqui se ele não for um triãngulo eu verifico se ele é um retângulo
            if (Math.pow(base, 2) == Math.pow(lado2, 2) + Math.pow(lado3, 2) ||
                    Math.pow(lado2, 2) == Math.pow(base, 2) + Math.pow(lado3, 2) ||
                    Math.pow(lado3, 2) == Math.pow(base, 2) + Math.pow(lado2, 2)) {
                // Se for eu dou um print nisso
                System.out.println("O triângulo é retângulo :)");
            } else {
                // Se não, vai esse
                System.out.println("O triângulo não é retângulo :(");
            }


        }

    }

    public void definindoTipo () {
        System.out.println("/*****************************************/");
        System.out.println("/*         Definindo Tipo - Lado         */");
        System.out.println("/*****************************************/");


        if (base == lado2 && base == lado3) {
            System.out.println("Esse triângulo é um Equilátero...");
        } else if (base != lado2 && base != lado3 && lado2 != lado3) {
            System.out.println("Esse triângulo é um Escaleno...");
        } else {
            System.out.println("Esse triângulo é um Isosceles...");
        }
    }
}
