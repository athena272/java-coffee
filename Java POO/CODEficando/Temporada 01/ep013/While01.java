package ep013;

import javax.swing.JOptionPane;
/**
 * While
 */
public class While01 {
    public static void main(String[] args) {
        int valeu = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        int i = 1;
        int fato = 1;
        while (1 <= valeu) {
            fato *= i;
            i++;
        }
        System.out.println("O fatorial de " + valeu + " é " + fato);
    }
    
}