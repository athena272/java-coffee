public class Program {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.nome = "Joa Carlos";

        Livro livro = new Livro();
        livro.nome = "Java 8";
        livro.autor = autor;

        Livro outroLivro = new Livro();
        livro.nome = "Java 8";
        livro.autor = autor;

        System.out.println(livro.nome.equals(outroLivro.nome));
    }
}
