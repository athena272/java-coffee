/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author guilh
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int valor[] = {10, 40, 100, 0, 1, 19};
      ///deixar valores em ordem
      Arrays.sort(valor);

      //Laço exclusivo para vetores
      for ( int j: valor) {
          System.out.println(j);
          //Resultado da busca
        
      }
    }
    
}
