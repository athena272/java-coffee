/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor05;

import java.util.Arrays;

/**
 *
 * @author guilh
 */
public class Vetor05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vetor_unico[] = new int[20];
        Arrays.fill(vetor_unico, 1);
        for (int j: vetor_unico){
            System.out.println(j);
        }
        
    }
    
}
