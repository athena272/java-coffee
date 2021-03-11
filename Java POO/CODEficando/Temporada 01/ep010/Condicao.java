package ep010;
import java.util.Scanner;

public class Condicao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("1ª Valor: ");
        int a = teclado.nextInt();
        System.out.print("2ª Valor: ");
        int b = teclado.nextInt();
        if(a > b) {
            System.out.println(a + " é maior que " + b);
        } else if (b < a) {
            System.out.println(b + " é maior que " + a);
        } else {
            System.out.println(a + " é igual a " + b);
        }
    }    
}
