package com.bluefox.secondChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesBancarias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();
        List<String> extrato = new ArrayList<>();

        for (int i = 0; i < quantidadeTransacoes; i++) {
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }
            String tipoTransacao = scanner.nextLine();
            double valorTransacao = scanner.nextDouble();
            if (tipoTransacao.equalsIgnoreCase("d")) {
                saldo += valorTransacao;
                extrato.add(String.format("%d. Deposito de %.1f", i+1, valorTransacao));
            } else if (tipoTransacao.equalsIgnoreCase("s")) {
                saldo -= valorTransacao;
                extrato.add(String.format("%d. Saque de %.1f", i+1, valorTransacao));
            } else {
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
            }
        }

        System.out.println("Saldo: " + saldo);
        System.out.println("Transacoes:");

        for (String string : extrato) {
            System.out.println(string.replace(",", "."));
        }

        scanner.close();
    }
}