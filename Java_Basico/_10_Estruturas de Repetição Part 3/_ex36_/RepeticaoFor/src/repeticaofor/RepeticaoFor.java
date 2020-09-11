/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticaofor;

/**
 *
 * @author guilh
 */
public class RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Contador de cambalhotas
        for(byte i = 1; i <= 3; i++){
            for(byte j = 0; j <= 2; j += 2){
                System.out.print("I = " + i);
                System.out.print(" | ");
                System.out.println("J = " + j);
            }
        }
       
    }
    
}
