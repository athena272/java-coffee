package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

public class MiniLivro extends Livro {
    public MiniLivro(Autor autor) {
        super(autor);
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
