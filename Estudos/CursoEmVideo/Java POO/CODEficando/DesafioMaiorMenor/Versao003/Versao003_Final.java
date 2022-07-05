import java.util.Scanner;

public class Versao003_Final {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o 1º valor: ");
        int A = teclado.nextInt();
        System.out.print("Digite o 2º valor: ");
        int B = teclado.nextInt();
        System.out.print("Digite o 3º valor: ");
        int C = teclado.nextInt();
        //Verificar se A é menor do que B(e trocar seus valores)
        if (A < B) {
            int auxiliar = 0;

            auxiliar = B;
            B = A;
            A = auxiliar;
        }
        //Agora vou verificar onde o C se encaixa(Debug)
        System.out.println("------------");
        System.out.println(A + " > " + B);
        System.out.println("------------");
        if(C < B) {
            System.out.println(A + " > " + B + " > " + C);
        } else if(C > A) {
            System.out.println(C + " > " + A + " > " + B);
        } else {
            System.out.println(A + " > " + C + " > " + B);
        }
    }
}
