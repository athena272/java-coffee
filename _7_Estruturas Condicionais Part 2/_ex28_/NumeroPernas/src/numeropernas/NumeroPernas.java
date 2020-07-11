/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeropernas;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class NumeroPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantas pernas tem?: ");
        int pernas = teclado.nextInt();
        switch (pernas){
            case(1):
                System.out.println("Sasci");
                break;
            case(2):
                System.out.println("Bípede");
                break;
            case(4):
                System.out.println("Quadrúpede");
                break;
            case 6, 8:
                System.out.println("Aracnídeo");
                break;
            default:
                System.out.println("É um E.T");
                break;
        }
    }
    
}
