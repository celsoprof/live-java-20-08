package br.com.fiap.imc.teste;

public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.valor = 30;
        int valor = calc.somar(23, 84);
        System.out.println(valor);
        System.out.println(calc.somar(5, 7));
        System.out.println(calc.recuperarNome());
    }

}
