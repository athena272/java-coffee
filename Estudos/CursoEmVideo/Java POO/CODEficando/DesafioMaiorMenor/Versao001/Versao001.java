
import java.util.Scanner;
import java.util.Arrays;
/**
 * Versao001
 */
public class Versao001 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero[] = new int[3];
        //Variável de controle
        byte i = 0;
        //Primeira Iteração
        while (i <= 2) {
            System.out.print("Digite o " + (i+1) + "º valor: ");
            numero[i] = teclado.nextInt();
            i++;
        }
        //Apelando para o Array colocar em ordem crescente
        Arrays.sort(numero);
        System.out.println("O menor número é: " + numero[0]);
        System.out.println("O número intermediário é: " + numero[1]);
        System.out.println("O maior número é: " + numero[2]);
    }
}