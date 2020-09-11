/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication59;

/**
 *
 * @author guilh
 */
public class JavaApplication59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome = "João";
        imprimeNome("Empty");
   
    }
    public static void imprimeNome(String nome) {
        if (! nome.isEmpty()){
            System.out.println("Tudo bem " + nome + "?");
        }
        else {
            System.out.println("O nome é " + nome + "?");
        }
        
    }
    
}
