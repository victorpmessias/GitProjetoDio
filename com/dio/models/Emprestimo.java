package com.dio.models;
import java.util.Scanner;


public class Emprestimo {
    public static void init() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual valor você quer emprestar:");
        double valorEmprestado = scan.nextDouble();
        double valorComJuros = calculaJuros(valorEmprestado);
        System.out.println("Em quantas parcelas você quer pagar(parcelamos até 10 vezes.):");
        int parcelas = scan.nextInt();
        double valorFinal = calculaParcelas(valorComJuros, parcelas);
        System.out.println("");
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("Você deseja pegar R$ " + valorEmprestado + " emprestado com pagamento dividido em " + parcelas + " vezes.");
        System.out.println("Cada parcela ficara no valor de: R$" + valorFinal/parcelas + ", com valor total a pagar de: R$" + valorFinal + "." );

        scan.close();
    }

    public static double calculaJuros(double valor) {
        if (valor <= 1000){
             valor += (valor * 0.1 );
        } else if (valor <= 5000){
            valor += (valor * 0.2 );

        } else if (valor <= 10000){
            valor += (valor * 0.3 );

        } else if (valor <= 15000){
            valor += (valor * 0.4 );

        } else{
            valor += (valor * 0.5 );
        }


        return valor;
    }

    public static double calculaParcelas(double valor, int parcelas){
        switch(parcelas){
            case 1:
                break;
            case 2:
                valor = valor + (valor * 0.1);
                break;
            case 3:
                valor = valor + (valor * 0.15);
                break;
            case 4:
                valor = valor + (valor * 0.2);
                break;
            case 5:
                valor = valor + (valor * 0.25);
                break;
            case 6:
                valor = valor + (valor * 0.3);
                break;
            case 7:
                valor = valor + (valor * 0.35);
                break;
            case 8:
                valor = valor + (valor * 0.4);
                break;
            case 9:
                valor = valor + (valor * 0.45);
                break;
            case 10:
                valor = valor + (valor * 0.50);
                break;
            default:
            break;

        }
        return valor;
    }
}
