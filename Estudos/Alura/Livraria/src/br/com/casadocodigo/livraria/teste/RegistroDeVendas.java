package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.CarrinhoDeCompra;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.Produto;

public class RegistroDeVendas {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        LivroFisico livroFisico = new LivroFisico(autor);
        livroFisico.setNome("Test-Driven Development");
        livroFisico.setValor(59.90);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test-Driven Development");
        ebook.setValor(29.90);

        if(livroFisico.aplicaDescontoDe10Porcento()) {
            System.out.println("Valor agora é: " + livroFisico.getValor());
        }

        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
        carrinhoDeCompra.adiciona(livroFisico);
        carrinhoDeCompra.adiciona(ebook);
        System.out.println("Total: " + carrinhoDeCompra.getTotal());

        Produto[] produtos = carrinhoDeCompra.getProdutos();
        for(int i = 0; i <= produtos.length; i++) {
            try {
                Produto produto = produtos[i];
                if(produto != null) {
                    System.out.println(produto.getValor());
                }
            }
            catch (Exception e) {
                System.out.println("Deu exception no índice: " +  i);
                e.printStackTrace();
            }
        }
        System.out.println("Fui executado!");
    }
}
