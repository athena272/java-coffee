package ep009;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um nome: ");
        String nome = teclado.next();
        System.out.print("Digite o seu peso: ");
        int peso = teclado.nextInt();
        System.out.println(nome + " pesa " + peso + "Kg");


    }
}
