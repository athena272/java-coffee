/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horadosistema;

import java.util.Date;

/**
 *
 * @author guilh
 */
public class HoraDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date relogio = new Date();
        //Quando usar new criamos um novo objeto, no caso "relogio"
        System.out.println("A hora do sistema é");
        System.out.println(relogio.toString());
        
        
    }
    
}
