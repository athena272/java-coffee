public class RegistroDeVendas {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        LivroFisico livroFisico = new LivroFisico(autor);
        livroFisico.setNome("Test-Driven Development");

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test-Driven Development");

        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
        carrinhoDeCompra.adiciona(livroFisico);
        carrinhoDeCompra.adiciona(ebook);
    }
}
