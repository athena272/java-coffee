/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

/**
 *
 * @author guilh
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte valor[] = {10, 40, 100, 0, 1, 19};
        //Laço para imprimir valores
        System.out.println("Número de casas do vetor: " + valor.length);
        System.out.println("---------------");
        //Usar o método length que mostra o tamanho, subtrair 1, assim temos o fim do laço
        for( byte i = 0; i < (valor.length); i++) {
            System.out.println(valor[i]);
        } 
        
    }  
    
}
