/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class Aula07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lutador lutadores[] = new Lutador[6];
        
        lutadores[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 
                                    11, 2, 1);
        lutadores[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 
                                    14, 2, 3);
        lutadores[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f,
                                    12, 2, 1);
        lutadores[3] = new Lutador("Dead Code", "Australia", 28, 1.93f, 
                                    81.6f, 13, 0, 2);
        lutadores[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f,
                                    5, 4, 3);
        lutadores[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f,
                                    12, 2, 4);
        //-------------------------------------
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite sua altura: ");
        double altura = teclado.nextFloat();
        System.out.print("Digite o gênero: ");
        char sexo = teclado.next().charAt(0);
        double peso_idealm = 0;
        double peso_idealf = 0;
        switch (sexo) {
            case 'M' : case 'm':
                peso_idealm = (72.7 * altura) - 58f;
                System.out.println(peso_idealm);
                break;
            case 'F' : case 'f':
                peso_idealf = (66.1 * altura) - 44.7f;
                System.out.println(peso_idealf);
                break;
        }
    }
    
}
