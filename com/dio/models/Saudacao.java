package com.dio.models;

import java.util.Scanner;

public class Saudacao {

    public static void init() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ola! Que horas são");
        int hora = scan.nextInt();

        if (hora >= 12 & hora <= 17) {
            System.out.println("Boa Tarde");
        } else if (hora >= 18 & hora <= 24) {
            System.out.println("Boa Noite");
        } else if (hora >= 6 & hora <= 11) {
            System.out.println("Bom dia");
        } else {
            System.out.println("É madrugada vai dormir disgraça!!!!");
        }

        scan.close();

    }
}
