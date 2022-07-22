public class Pessoa {
    public  String nomePessoa;

    public Pessoa(String nome) {
        this.nomePessoa = nome;
    }

    public  void mostraNome() {
        System.out.println("Olá, meu nome é: " + nomePessoa);
    }
}
