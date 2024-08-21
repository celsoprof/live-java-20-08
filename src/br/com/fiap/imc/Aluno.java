package br.com.fiap.imc;

public class Aluno {

    String nome;
    String email;
    int peso;
    double altura;
    double imc;
    String estadoImc;

    public void calcularImc(){
        imc = peso / Math.pow(altura, 2);
    }

    public void determinarEstado(){

        if(imc < 18.5){
            estadoImc = "Abaixo do peso";
        } else {
            estadoImc = "Peso normal";
        }

    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso);
        System.out.println("IMC: " + imc);
        System.out.println("E-mail: " + email);
        System.out.println("Estado IMC: " + estadoImc);
        System.out.println("--------------------------------");
    }

}
