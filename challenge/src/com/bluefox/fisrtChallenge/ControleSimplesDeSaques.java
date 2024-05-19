package com.bluefox.fisrtChallenge;

import java.util.Scanner;

public class ControleSimplesDeSaques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double limit = scanner.nextDouble();
        boolean end = false;
        while(limit > 0 && end == false){
            double withdrawal = scanner.nextDouble();

            if (withdrawal == 0) {
                System.out.println("Transacoes encerradas.");
                end = true;
            } else if (withdrawal <= limit) {
                limit -= withdrawal;
                System.out.println(String.format("Saque realizado. Limite restante: %.1f", limit));
            } else {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                end = true;
            }
        }

        scanner.close(); 
    }
}