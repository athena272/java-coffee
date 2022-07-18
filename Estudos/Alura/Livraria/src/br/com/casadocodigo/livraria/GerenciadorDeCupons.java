package br.com.casadocodigo.livraria;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GerenciadorDeCupons {
    private Set<String> cupons;
    public GerenciadorDeCupons() {
        this.cupons = new HashSet<String>();
        cupons.addAll(Arrays.asList("CUP74", "CUP158", "CUP14", "CUP52", "CUP21"));
    }
    public boolean validaCupom(String cupom) {
        return this.cupons.contains(cupom);
    }
}
