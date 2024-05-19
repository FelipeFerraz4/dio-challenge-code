package com.bluefox.secondChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RegistroTransacoesComStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();
        List<Transacao> transacoes = new ArrayList<>();

        for (int i = 0; i < quantidadeTransacoes; i++) {
            char tipoTransacao = scanner.next().charAt(0); 
            double valorTransacao = scanner.nextDouble();

            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
            transacoes.add(transacao); 

            if (transacao.getTipo() == 'D' || transacao.getTipo() == 'd') { 
                saldo += valorTransacao;
            } else if (transacao.getTipo() == 'S' || transacao.getTipo() == 's') { 
                saldo -= valorTransacao; 
            }
        }

        System.out.println("Saldo : " + saldo); 
        System.out.println("Transacoes:"); 
        
        List<String> extrato = transacoes.stream()
                        .map(transacao -> String.format("%c de %.1f", transacao.getTipo(), transacao.getValor()))
                        .collect(Collectors.toList());

        extrato.forEach(transacao -> System.out.println(transacao.replace(",", ".")));
               
        scanner.close(); 
    }
}

class Transacao {
    private char tipo;
    private double valor;

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}