package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

public class LivroFisico extends Livro implements Promocional{
    public LivroFisico(Autor autor) {
        super(autor);
    }

    public double getTaxaImpressao() {
        return this.getValor() * 0.05;
    }
    public boolean aplicaDescontoDe(double porcentagem) {
        if(porcentagem > 0.3) {
            return false;
        }
        double desconto = this.getValor() * porcentagem;
        this.setValor(this.getValor() - desconto);
        System.out.println("Aplicando desconto no br.com.casadocodigo.livraria.produtos.LivroFisico");
        return true;
    }
    @Override
    public int compareTo(Produto outro) {
        if(this.getValor() < outro.getValor()) {
            return -1;
        }
        if(this.getValor() > outro.getValor()) {
            return 1;
        }
        return 0;
    }
}
