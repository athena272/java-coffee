/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

/**
 *
 * @author guilh
 */
public class Aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta("BIC", "Verde", 0.7f);
        c1.status();
        
        /*
        c1.setModelo("BIC");
        //ERROR c1.modelo = "BIC";
        
        c1.setPonta(0.7f);
        //ERROR c1.ponta = 0.7f;
        
        c1.status();
        */
    }
    
}
