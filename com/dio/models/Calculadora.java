package com.dio.models;

import java.util.Scanner;

public class Calculadora {

    public static void init() {
        calculadora();
    }

    public static void calculadora() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Calculadora");
        System.out.println("Digite o primeiro valor:");
        float a = scan.nextFloat();
        System.out.println("Digite o segundo valor:");
        float b = scan.nextFloat();
        System.out.println("Escolhe uma operação:");
        System.out.println("[1]Adicionar ");
        System.out.println("[2]Subtrair");
        System.out.println("[3]Multiplicar");
        System.out.println("[4]Dividir");
        int escolha = scan.nextInt();

        switch (escolha) {
            case 1:
            System.out.println(somar(a, b));
            break;
            case 2:
            System.out.println(subtrair(a, b));
            break;

            case 3:
            System.out.println(multiplicar(a, b));
            break;

            case 4:
            System.out.println(dividir(a, b));
            break;


        }

        scan.close();
    }

    public static float somar(float a, float b) {
        return a + b;
    }

    public static float subtrair(float a, float b) {
        return a - b;
    }

    public static float multiplicar(float a, float b) {
        return a * b;
    }

    public static float dividir(float a, float b) {
        return a / b;
    }
}