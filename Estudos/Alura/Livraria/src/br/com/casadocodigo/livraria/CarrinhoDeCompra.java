package br.com.casadocodigo.livraria;

import br.com.casadocodigo.livraria.produtos.Produto;

public class CarrinhoDeCompra {
    private double total;
    private Produto[] produtos = new Produto[10];
    private int contador = 0;
    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " + produto);
        this.produtos[this.contador] = produto;
        this.contador++;
        this.total += produto.getValor();
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public double getTotal() {
        return total;
    }
}
