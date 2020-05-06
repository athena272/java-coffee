/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetipos;

/**
 *
 * @author guilh
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Incompatiblidade entre números e Strings;
        int idade = (int) 30;
        String valor = Integer.toString(idade); //Converter número para String
        //Acabar com a briga
        System.out.println(valor);
        //Fazer o inverso
        String novo_valor = "28";
        int nova_idade = Integer.parseInt(novo_valor);
        System.out.println(nova_idade);
        //fazer de String para Float
        String palavra_flutuante = "95.6";
        float numero_flutuante = Float.parseFloat(palavra_flutuante);
        //System.out.println(numero_flutuante);
        System.out.format("%.3f \n", numero_flutuante);
    }
    
}
