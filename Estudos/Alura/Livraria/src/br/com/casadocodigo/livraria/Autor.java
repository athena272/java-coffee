package br.com.casadocodigo.livraria;

public class Autor {
    private String nome;
    private String email;
    private String cpf;
    public void mostrarDetalhes() {
        System.out.println("Monstrando detalhes do br.com.casadocodigo.livraria.Autor");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Email: " + this.getEmail());
        System.out.println("CPF: " + this.getCpf());
    }
    @Override
    public boolean equals(Object obj) {
        Autor outroAutor = (Autor) obj;
        return this.nome.equals(outroAutor.nome);
    }
    //Gettes and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
