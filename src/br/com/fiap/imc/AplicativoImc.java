package br.com.fiap.imc;

import br.com.fiap.imc.teste.Calculadora;

import java.util.Scanner;

public class AplicativoImc {

    public static void main(String[] args) {
        System.out.println("CALCULADORA IMC");

        Scanner leitor = new Scanner(System.in);

        Aluno a1 = new Aluno();
        Aluno a3 = new Aluno("Celso", 98);

        System.out.print("Digite o nome: ");
        Aluno a2 = new Aluno(leitor.nextLine());

        Aluno.idade = 18;

        System.out.print("Digite o nome: ");
        a1.setNome(leitor.nextLine());

        System.out.print("Digite a altura: ");
        a1.setAltura(leitor.nextDouble());

        System.out.print("Digite o peso: ");
        a1.setPeso(leitor.nextInt());
        //a1.email = "pedro@email.com";

        a1.calcularImc();
        System.out.println(a1.getImc());

//        a2.nome = "Ana";
//        a2.altura = 1.65;
//        a2.peso = 30;
//        a2.email = "ana@email.com";
//
//        a2.calcularImc();

        a1.exibirDados();
        a2.exibirDados();



    }

}
