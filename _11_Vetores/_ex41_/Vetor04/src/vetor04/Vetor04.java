/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author guilh
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vetor[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //Encontrar um número em alguma posição
        int pos = Arrays.binarySearch(vetor, 9 );
        //Imprimir resultado
        System.out.println("Encontrei o valor na posição: " + pos);
    }
    
}
