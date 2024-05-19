package com.bluefox.fisrtChallenge;

import java.util.Scanner; 

public class VerificadorNumeroConta { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        String accountNumber = scanner.nextLine();
        try {
            if (accountNumber.length() != 8) {
                accountNumberValidation(accountNumber);
            } else {
                System.out.println("Numero de conta valido.");
            }
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        } finally {
            scanner.close();
        }
    }

    static void accountNumberValidation(String accountNumber) throws IllegalArgumentException {
        if (accountNumber.length() != 8) {
            throw new IllegalArgumentException("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
        } else {
            System.out.println("Numero de conta valido.");
        }
    }
}