/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, s = 0;
        String objeto = null;
        Scanner teclado = new Scanner(System.in);
        //Grande laço
        do {
            System.out.print("Digite um número: ");
            num = teclado.nextInt();
            s += num; //s = s + num
            System.out.print("Quer continuar?[S/N]: ");
            objeto = teclado.next();
        } while(objeto.equals("S"));
        //Saindo do laço e exindo a soma dos números
        System.out.println("---------------------");
        System.out.println("A soma dos números foi: " + (s));
    }
    
}
