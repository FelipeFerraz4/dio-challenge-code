package com.bluefox.fisrtChallenge;

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = -1;
        double balance = 0;

        while(option != 0) {
            double value;
            // System.out.println("1 - Depositar\n" +
            //                   "2 - Sacar\n" +
            //                   "3 - Consultar Saldo\n" +
            //                   "0 - Encerrar");
            option = scanner.nextInt();
    
            switch (option) {
                case 1:
                    value = scanner.nextDouble(); 
                    balance += value;
                    System.out.println(String.format("Saldo atual: %.1f", balance));
                    break;
                case 2:
                    value = scanner.nextDouble(); 
                    if (balance >= value) {
                        balance -= value;
                        System.out.println(String.format("Saldo atual: %.1f", balance));
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.println(String.format("Saldo atual: %.1f", balance));
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente."); 
                    break;
            }
        }


        scanner.close();
    }
}