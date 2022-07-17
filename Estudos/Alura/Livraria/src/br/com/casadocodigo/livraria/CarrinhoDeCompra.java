package br.com.casadocodigo.livraria;

import br.com.casadocodigo.livraria.produtos.Produto;

import java.util.ArrayList;

public class CarrinhoDeCompra {
    private double total;
    private ArrayList<Produto> produtos;
    public CarrinhoDeCompra() {
        this.produtos = new ArrayList<>();
    }
    public void adiciona(Produto produto) {
        this.produtos.add(produto);
    }
    public void remove(int posicao) {
        this.produtos.remove(posicao);
    }

    public double getTotal() {
        return total;
    }
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

}
