import java.util.Scanner;
/**
 * DesafioMaiorMenor
 */
public class DesafioMaiorMenor01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero[] = new int[3];
        
        //Variáveis de inicialização
        byte i = 0;
        int maior, menor;
        maior = menor = 0;
        //Primeira Iteração(encontrar o maior)
        while (i <= 2) {
            System.out.print("Digite o " + (i+1) + "º valor: ");
            numero[i] = teclado.nextInt();
            if(i == 0) {
                maior = menor = numero[i];
            }
            else {
                if(numero[i] > maior ) {
                    maior = numero[i];
                }
            }
            i++;
        }
        //Variávl de inicialização
        i = 0;
        //Segunda Iteração(encontrar o menor)
        while (i <= 2) {
            if(numero[i] < menor) {
                menor = numero[i];
            }
            i++;
        }
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}