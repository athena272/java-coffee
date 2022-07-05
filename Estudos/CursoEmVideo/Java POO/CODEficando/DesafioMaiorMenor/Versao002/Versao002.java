import java.util.Scanner;

public class Versao002 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("O 1º valor: ");
        int A = teclado.nextInt();
        System.out.print("O 2º valor: ");
        int B = teclado.nextInt();
        System.out.print("O 3º valor: ");
        int C = teclado.nextInt();
        //Verificar se A é maior do que B(trocar valores)
        if(A < B) {
            int auxiliar = 0;

            auxiliar = B;
            B = A;
            A = auxiliar;
        }
        //Depois verficar onde o C se encaiza
        System.out.println(A + " > " + B);
        if (C < B) {
            System.out.println(A + " > " + B + " > " + C);
        } else if( C > A){
            System.out.println(C + " > " + A + " > " + B);
        } else {
            System.out.println(A + " > " + C + " > " + B);
        }
        /*
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
        */
    }
}
