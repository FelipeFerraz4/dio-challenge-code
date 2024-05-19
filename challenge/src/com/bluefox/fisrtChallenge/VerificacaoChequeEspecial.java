package com.bluefox.fisrtChallenge;

import java.util.Scanner;

public class VerificacaoChequeEspecial { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        double balance = scanner.nextDouble();
        double withdrawal = scanner.nextDouble();
        double limitCheck = 500;

        if (withdrawal <= balance) {
            System.out.println("Transacao realizada com sucesso.");
        } else if (withdrawal <= balance + limitCheck) {
            System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
        } else {
            System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
        }

        scanner.close(); 
    }
}