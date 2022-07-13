package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

public abstract class Livro implements Produto{
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    //Constructor
    public Livro(Autor autor){
        this();
        this.autor = autor;
    }
    public Livro() {
        this.isbn = "000-00-00000-00-0";
    }
    //My Methods
    void mostrarDetalhes() {
        System.out.println("Monstrando detalhes do livro");
        System.out.println("Nome: " + this.nome);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Valor: " + this.valor);
        System.out.println("ISBN: " + this.isbn);
        if(this.temAutor()) {
            this.autor.mostrarDetalhes();
        }
        System.out.println("--");
    }

    //Abstract method with interface

    public boolean temAutor() {
        return this.autor != null;
    }
    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

}
