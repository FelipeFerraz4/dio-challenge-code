package com.bluefox.fisrtChallenge;

import java.util.Scanner;

public class VerificadorElegibilidadeConta { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Voce esta elegivel para criar uma conta bancaria.");
        } else {
            System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
        }

        scanner.close(); 
    }
}