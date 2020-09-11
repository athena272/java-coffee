/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author guilh
 */
public class ResolucaoTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Toolkit kit_ferramentas = Toolkit.getDefaultToolkit(); //Pegue as ferramentas padrões do sistema
        Dimension tela = kit_ferramentas.getScreenSize(); //Pegue a dimensão da tela das ferramentas padrões do sistema e de a váriavel "tela" o tamanho da tela
        System.out.print("A resolução do seu sistema é: ");
        System.out.print(tela.width); //Tamanho da tela na horizontal
        System.out.println(" X " + tela.height); //Digitei um X entre aspas para ficar bonitinha a saída, e o outro comando mostra a dimensão da tela na vertical
        
    }
    
}
