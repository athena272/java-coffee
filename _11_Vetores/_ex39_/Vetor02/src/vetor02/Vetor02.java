/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        //Pergunta ano para usário
        Scanner tec = new Scanner(System.in);
        System.out.print("Em que ano estamos?: ");
        int ano = tec.nextInt();
        //Verificar se o ano é bissexto
        if ((ano % 4 == 0) && (ano % 100 != 0)) {
            byte dias[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            System.out.println("O ano É bissexto!");
            System.out.println("---------------");
            //lAÇO DE REPETIÇÃO
            for(byte j = 0; j < mes.length; j++) {
                System.out.println("O mês de " + mes[j] + " tem " + dias[j] + " dias");
            }
        }
        else {
            byte dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            System.out.println("O ano NÃO É bissexto");
            System.out.println("---------------");
            //lAÇO DE REPETIÇÃO
            for(byte j = 0; j < mes.length; j++) {
                System.out.println("O mês de " + mes[j] + " tem " + dias[j] + " dias");
            }
        }
        
    }
    
}
