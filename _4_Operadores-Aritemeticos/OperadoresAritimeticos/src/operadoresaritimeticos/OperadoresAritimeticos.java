/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritimeticos;

/**
 *
 * @author guilh
 */
public class OperadoresAritimeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 3;
        int n2 = 5;
        float m = (n1+n2) / 2;
        System.out.println("A média é igual a " + m);
        //---------------------------------------
        //Operadoes Unarios, Incrementos e descrementos
        int numero = 5;
        int valor = 5 + ++numero;
        System.out.println("-----------------------");
        System.out.println(valor);
        //--------------------
        //Operadores de Atribuição
        int x = 4;
        int y = 12;
        y*= 3; //y = y * 3
        x+= 2;//x = x + 2
        System.out.println("------------------------");
        System.out.println(x);
        System.out.println(y);
        System.out.println("-------------------------");
        //Operadores de Arredondamento
        //Floor
        float t = (float) 8.9; 
        int ar_baixo = (int) Math.floor(t);
        //Ceil
        float v = (float) 9.1;
        int ar_cima = (int) Math.ceil(v);
        //round
        float u = (float) 7.4;
        int ar_aritimetico = (int) Math.round(u);
        //Prints
        System.out.println(ar_baixo);
        System.out.println(ar_cima);
        System.out.println(ar_aritimetico);
        System.out.println("-------------------------");
        //gerador de números aleatorios
        double aleatorio = Math.random();
        int ale = (int) (0 + aleatorio * (100 - 0));
        System.out.println(ale);
    }
    
}
