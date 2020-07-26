/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador01;

/**
 *
 * @author guilh
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 1;
        while (cc < 10) {
            cc++;
            if ((cc == 2) || (cc == 4) || (cc == 5)){
                continue;
            }
            if(cc == 8){
                break;
            }
            System.out.println((cc) + "ª Cambalhota");
        }
    }
    
}
