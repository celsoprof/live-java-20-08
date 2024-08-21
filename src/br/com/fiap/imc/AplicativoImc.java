package br.com.fiap.imc;

public class AplicativoImc {

    private static void calcularImc(){

    }

    public static void main(String[] args) {
        System.out.println("CALCULADORA IMC");

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        new Aluno();

        a1.nome = "Pedro";
        a1.altura = 1.78;
        a1.peso = 76;
        a1.email = "pedro@email.com";

        a1.calcularImc();
        a1.determinarEstado();

        a2.nome = "Ana";
        a2.altura = 1.65;
        a2.peso = 30;
        a2.email = "ana@email.com";

        a2.calcularImc();
        a2.determinarEstado();

        a1.exibirDados();
        a2.exibirDados();
        a2.exibirDados();
        a2.exibirDados();
        a2.exibirDados();

    }

}
