/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author guilh
 */
public class Aula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco pessoa1 = new ContaBanco();
        pessoa1.setNumConta(111);
        pessoa1.setDono("Esmeralda");
        pessoa1.abrirConta("CC");
        
        ContaBanco pessoa2 = new ContaBanco();
        pessoa2.setNumConta(222);
        pessoa2.setDono("Rivaldo");
        pessoa2.abrirConta("CP");
        
        pessoa1.depositar(150);
        pessoa2.depositar(100);
        
        //Exibir estado do banco
        pessoa1.estadoAtual();
        pessoa2.estadoAtual();
    }
    
}
