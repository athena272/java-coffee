/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maiormenor;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class MaiorMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Importanto scanner para receber dados do usuário
        Scanner teclado = new Scanner(System.in);
        //revebendo os dados
        System.out.print("Digite o 1º Valor: ");
        int v1 = teclado.nextInt();
        System.out.print("Digite o 2º Valor: ");
        int v2 = teclado.nextInt();
        System.out.print("Digite o 3º Valor: ");
        int v3 = teclado.nextInt();
        //Descobrir maior, intermediário e menor
        int maior, menor, interm;
        //Achar maior
        maior = menor =  v1;
        if (maior < v2) {
            maior = v2;
        
        } else if (maior < v3) {
            maior = v3;
        }
        //Achar o menor
        if (menor > v2) {
            menor = v2;
        
        } else if (menor > v3) {
            menor = v3;
        }
        //Achar um intermediário
        
      
   
        
    }
    
}
