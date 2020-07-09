/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner; //Biblioteca para entrada de dados

/**
 *
 * @author guilh
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float nota = 8.5f;
        String nome = "Guilherme";
        System.out.println("A sua nota é " + nota);
        //Print Formatado
        float nota_2 = (float) 5.3;
        System.out.format("A nota de %s é %.2f  e %.2f \n",nome, nota, nota_2);//Print formatado com 2 casas decimais
        //---------------------------------------------------------------------
        System.out.println("----------------------------------------------------");
        //Entrada de Dados;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu nome, por favor: ");
        String new_name = teclado.nextLine(); //Receber um nome digitado
        System.out.print("Digite sua nota, por favor: ");
        float new_nota = teclado.nextFloat(); //Receber um número digitado
        System.out.format("Olá %s, você tirou %.1f \n", new_name, new_nota); 
    }
    
}
