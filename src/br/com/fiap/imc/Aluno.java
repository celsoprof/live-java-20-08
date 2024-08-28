package br.com.fiap.imc;

public class Aluno {

    public Aluno(String nome){
        this.nome = nome;
    }

    public Aluno(){}

    public Aluno(String nome, int peso){
        this.nome = nome;
        this.peso = peso;
    }

    public static int idade;

    private String nome;
    //private String email;
    //private String password;
    private int peso;
    private double altura;
    private double imc;
    private String estadoImc;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public double getImc(){
        return imc;
    }


    public void calcularImc(){
        imc = peso / Math.pow(altura, 2);
        determinarEstado();
    }

    private void determinarEstado(){

        if(imc < 18.5){
            estadoImc = "Abaixo do peso";
        } else {
            estadoImc = "Peso normal";
        }

    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso);
        System.out.println("IMC: " + String.format("%.1f", imc));
        //System.out.println("E-mail: " + email);
        System.out.println("Estado IMC: " + estadoImc);
        System.out.println("Idade: " + idade);
        System.out.println("--------------------------------");
    }

    public boolean logar(){
        acessarBanco();
        return true;
    }

    private void acessarBanco(){
        System.out.println("Buscando usuário no banco de dados...");
    }

}
