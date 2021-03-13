package ep016;

import java.util.Scanner;

public class LeituraVetores {
    public static void main(String[] args) {
        int valor[] = new int[5];
        Scanner teclado = new Scanner(System.in);
        for (byte i = 0; i < valor.length; i++) {
            System.out.print("Digite o " + (i+1) + "º valor: ");
            valor[i] = teclado.nextInt();
        }
        //Encontrar maior e menor elemento
        int maior = valor[0];
        int menor = valor[0];
        for (byte j = 0; j < valor.length; j++) {
            if(valor[j] > maior) {
                maior = valor[j];
            }
            if(valor[j] < menor) {
                menor = valor[j];
            }
        }

        System.out.print("Os valores da lista foram: ");
        for(byte k = 0; k < valor.length; k++) {
            System.out.print(valor[k] + " ");
        }
        System.out.println("");
        System.out.println("O menor valor é: " + menor);
        System.out.println("O maior valor é: " + maior);
    }
}
