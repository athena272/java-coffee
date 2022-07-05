/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomasistema;

import java.util.Locale;

/**
 *
 * @author guilh
 */
public class IdiomaSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale linguagem = Locale.getDefault(); //Localize e oegue os padrões
        System.out.print("O seu sitema está em ");
        System.out.println(linguagem.getDisplayLanguage()); //Pegue(get) a linguagem do sistema
    }
    
}
