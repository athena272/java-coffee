package ep013;

import javax.swing.JOptionPane;
/**
 * Enquanto
 */
public class Enquanto {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        int k = 1;
        int fat = 1;
        while(k <= numero) {
        fat *= k;
        k++;
        }
        System.out.println("O fatorial de " + numero + " é " + fat);
    }
    
}