package br.com.casadocodigo.livraria;

import java.util.*;

public class GerenciadorDeCupons {
    private Map<String, Double> cupons;
    public GerenciadorDeCupons() {
        this.cupons = new HashMap<>();
        cupons.put("CUP74", 10.0);
        cupons.put("CUP158", 15.00);
        cupons.put("CUP14", 5.99);
        cupons.put("CUP52", 20.00);
        cupons.put("cab11", 10.00);

    }
    public Double validaCupom(String cupom) {
        return this.cupons.get(cupom);
    }
}
