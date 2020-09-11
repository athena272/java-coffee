/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao02;

/**
 *
 * @author guilh
 */
public class Operacoes {
    
    public static String contador(int i, int j) {
        String s = "";
        for (int c = i; c <=j; c++) {
            s += c + " ";
        }
        return s;
    }
    
}
