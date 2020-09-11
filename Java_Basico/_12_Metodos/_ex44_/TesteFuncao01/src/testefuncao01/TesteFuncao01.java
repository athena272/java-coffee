/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao01;

/**
 *
 * @author guilh
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    static int soma(int a, int b){
        int s = a + b;
        return s;
    }
    
    public static void main(String[] args) {
        System.out.println("Começou o Programa...");
        int sm = soma(5, 2);
        System.out.println("A soma vale " + sm);
    }
    
}
