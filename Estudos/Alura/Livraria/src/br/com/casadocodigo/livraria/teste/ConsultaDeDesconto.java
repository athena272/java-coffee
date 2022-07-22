package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.GerenciadorDeCupons;

public class ConsultaDeDesconto {
    public static void main(String[] args) {
        GerenciadorDeCupons cupons = new GerenciadorDeCupons();
        Double desconto = cupons.validaCupom("cab11");

        if(desconto != null){
            System.out.println("Cupom válido");
            System.out.println("Valor " + desconto);
        }
        else {
            System.out.println("Cupom não existe");
        }
    }
}
