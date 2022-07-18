package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.GerenciadorDeCupons;

public class ConsultaDeDesconto {
    public static void main(String[] args) {
        GerenciadorDeCupons cupons = new GerenciadorDeCupons();

        if(cupons.validaCupom("CUP1234")){
            System.out.println("Cupom válida");
        }
        else {
            System.out.println("Cupom não existe");
        }
    }
}
