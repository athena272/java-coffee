import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Agenda {
    private Set<Contato> contatos;

    public Agenda() {
        this.contatos = new HashSet<Contato>();
    }

    public void adicionarContato(Contato contato) {
        this.contatos.add(contato);
    }

    public void removeContato(String nomeContato) {
        for(Contato contato : contatos){
            if(contato.getName().equals(nomeContato)) {
                this.contatos.remove(contato);
                break;
            }
        }

    }
    public void getContatos() {
        System.out.println("#===============================#");
        System.out.println("MONSTRANDO LISTA DE CONTATOS");
        System.out.println("#===============================#");
        for(Contato contato : this.contatos) {
            System.out.println("--------------------------");
            contato.showContato();
        }
    }
}