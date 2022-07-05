/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Valor para captura de
        Scanner teclado = new Scanner(System.in);
        //Inicio do programa
        System.out.print("Digite o seu ano de nascimento, por favor: ");
        int ano = teclado.nextInt();
        int idade = 2020 - ano;
        System.out.println("Sua idade é de " + idade + " anos");
        //Verificar se é maior de idade
        if (idade >= 18) {
            System.out.println("Você é um gafanhoto maior de idade");
        }
        else {
            System.out.println("Você é um gafanhoto menor de idade");
        }
        
    }
    
}
