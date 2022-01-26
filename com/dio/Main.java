package com.dio;

import com.dio.models.Calculadora;
import com.dio.models.Emprestimo;
import com.dio.models.Saudacao;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("O que deseja fazer:");
        System.out.println("---------------------");
        System.out.println("[1]Calculadora");
        System.out.println("[2]Emprestimo");
        System.out.println("[3]Saudação");
        int i = scan.nextInt();

        switch (i) {
            case 1:
                Calculadora.init();
                scan.close();

                break;
            case 2:
                Emprestimo.init();
                scan.close();

                break;
            case 3:
                Saudacao.init();
                scan.close();

                break;
        }
        scan.close();
        System.exit(0);
    }
}