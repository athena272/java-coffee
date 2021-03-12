import java.util.Scanner;
/**
 * DesafioMaiorMenor
 */
public class DesafioMaiorMenor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("O 1º valor: ");
        int A = teclado.nextInt();
        System.out.print("O 2º valor: ");
        int B = teclado.nextInt();
        System.out.print("O 3º valor: ");
        int C = teclado.nextInt();
        //Primeiro
        int maior, interm, menor;
        if(A > B)  {
            maior = A;
            menor = B;
            if ((A < C) && (A < B)){
                maior = A;
                interm = C;
                menor = B;
            } else {
                maior = A;
                interm = B;
                menor = C;
            }
        }
        else {
            maior = B;
            menor = A;
            if ((menor > C) && (maior > C)) {
                maior = B;
                interm = A;
                menor = C;
            }
            else {
                maior = C;
                interm = B;
                menor = A;
            }
        }
        System.out.println("--------------");
        System.out.println("O menor valor é: " + menor);
        System.out.println("O valor intermdiário é: " + interm);
        System.out.println("O maior valor é: " + maior);
    }
    
}