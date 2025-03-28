package br.com.fecaf.model;

import java.util.Scanner;

public class Circulo {
    // Isso é um atributo
    public double raio, area, perimetro, diametro;

    /* Instancia o Objeto Scanner */
    Scanner scanner = new Scanner(System.in);


    public boolean cadastrarCirculo () {
        System.out.println("/******************************/");
        System.out.println("/*      Cadastro Circulo      */");
        System.out.println("/******************************/");
        System.out.println(" Informe o raio: ");
        raio = scanner.nextDouble();
        System.out.println("Circulo cadastrado com sucesso...");
        System.out.println("/******************************/");

        return true;
    }

    public void exibirCirculo () {
        System.out.println("/******************************/");
        System.out.println("O raio do circulo é igual a: " + raio);
        System.out.println("A area do círculo é igual a: " + area);
        System.out.println("O perimetro do circulo é igual a: " + perimetro);
        System.out.println("O diametro do circulo é igual a: " + diametro);
        System.out.println("/******************************/");
    }

    public void calcularArea() {
        System.out.println("/*     Calculando Área      */");

        //Calculo de Area
        //area = 3.14159 * (raio * raio);
        //area Math.PI * (raio * raio);

        area = Math.PI * Math.pow(raio, 2);
    }

    public void calcularPerimetro () {
        System.out.println("/*     Calculando Perimetro      */");

        perimetro = 2 * Math.PI * raio;
    }
}
