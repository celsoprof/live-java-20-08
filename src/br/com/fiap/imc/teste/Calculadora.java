package br.com.fiap.imc.teste;

import java.util.Scanner;

public class Calculadora {

    public int valor;

    public int somar(int valor1, int valor2){
        int soma = valor1 + valor2;
        System.out.printf("A soma de %s com %s é %s.\n", valor1, valor2, soma);
        return soma;
    }

    public String recuperarNome(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = leitor.nextLine();
        return "O nome digitado foi " + nome + ".";
    }

}
