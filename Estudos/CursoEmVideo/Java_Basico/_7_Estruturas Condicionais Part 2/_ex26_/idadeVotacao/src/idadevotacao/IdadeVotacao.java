/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idadevotacao;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class IdadeVotacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual seu ano de nascimento?: ");
        int nascimento = teclado.nextInt();
        int idade = 2020 - nascimento;
        System.out.println("Sua idade é: " + idade + " anos");
        //Condição para analisar a idade
        if (idade < 16){
            System.out.println("Você não pode votar");
        }
        else{
            if ((16 <= idade && idade < 18) || (idade >= 70)){
                System.out.println("Voto é opcional");
      
            }
            else{
                System.out.println("Voto obrigatório!");
            }
        }
    }
    
}
