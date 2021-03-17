/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confeitaria;

import java.util.Scanner;


/**
 *
 * @author guilh
 */
public class Pedido {
    //Atributos
    private String nome, telefone, endereco, sabor;
    private double valor;
    //Leitor de dados
    Scanner user = new Scanner(System.in);
    //Metodo Construtor

    public Pedido() {
    }
    //Métodos Get e Set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    //Metodos
    public void listaPedidos() {
        System.out.println("===LISTA PEDIDOS===");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Tefone: " + this.getTelefone());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("Sabor: " + this.getSabor());
        System.out.println("Valor: " + this.getValor());
    }
    
    public void adicionarPedios() {
        System.out.println("ADICIONANDO UM PEDIDO, por favor: ");
        System.out.print("Informe seu nome: ");
        this.setNome(user.next());
        
        System.out.print("Informe seu telefone: ");
        this.setTelefone(user.next());
        
        System.out.print("Informe seu endereço: ");
        this.setEndereco(user.next());
        
        System.out.print("Informe o sabor: ");
        this.setSabor(user.next());
        System.out.println("");
        
        System.out.print("Informe o valor: R$");
        this.setValor(user.nextDouble());
       
    }
    
    public void atualizarPedido() {
        
    }
    
    public void removerPedido() {
        
    }
    
}
