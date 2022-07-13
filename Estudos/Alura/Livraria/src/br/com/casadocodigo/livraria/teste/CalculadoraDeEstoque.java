package br.com.casadocodigo.livraria.teste;

public class CalculadoraDeEstoque {
    public static void main(String[] args) {
        double livroJava8 = 60;
        double livroTDD = 60;

        int numberInt = (int) livroJava8;

        double soma = livroTDD + livroJava8;
        System.out.println(soma);
        System.out.println(numberInt);
    }
}
