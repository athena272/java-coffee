package br.com.casadocodigo.livraria.jairo;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o numero de entradas: ");
        int numLeituras = teclado.nextInt();

        int cont = 0;
        while(cont < numLeituras)
        {
            String texto = teclado.next();
            encontraTexto(texto);

            cont++;
        }

    }

    public static void encontraTexto(String texto) {
        int total = 0;
        int indice = 0;
        while(indice < texto.length() - 1) {

            char letra = texto.charAt(indice);
            int proximoIndice = indice + 1;
            char proximaLetra = texto.charAt(proximoIndice);

            if(Character.isDigit(letra)) {
                StringBuilder numerosJuntos = new StringBuilder();
                numerosJuntos.append(letra);

                proximoIndice = indice + 1;
                proximaLetra = texto.charAt(proximoIndice);
                while (Character.isDigit(proximaLetra))
                {
                    numerosJuntos.append(proximaLetra);
                    if(proximoIndice >= texto.length() - 1) {
                        break;
                    }
                    proximoIndice++;
                    indice++;
                    proximaLetra = texto.charAt(proximoIndice);

                }
                total += Integer.parseInt(numerosJuntos.toString());
            }
            indice++;

        }
        System.out.println(total);;
    }
}
