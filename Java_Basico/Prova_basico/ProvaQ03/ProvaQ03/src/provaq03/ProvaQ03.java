/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaq03;

/**
 *
 * @author guilh
 */
public class ProvaQ03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int total = 0;
        int c[] = new int[10];
        
        for (int i = 0; i < c.length; i++) {
            c[i] = i + i;
        }
        
        for (int i = 0; i < c.length; i++) {
            total += c[i];
        }
        
        System.out.println(total);
    }
    
}
