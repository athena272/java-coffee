package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;

public class CadastroAutores {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");

        Autor outroAutor = new Autor();
        outroAutor.setNome("Rodrigo Turini");

        if(autor.equals(outroAutor)) {
            System.out.println("Igual");
        }
        else {
            System.out.println("Diferente");
        }
    }
}
