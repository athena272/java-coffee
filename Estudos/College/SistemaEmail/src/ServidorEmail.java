import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ServidorEmail {
    private List<Email> itens;

    public ServidorEmail(){
        itens = new ArrayList<>();
    }

    public int quantosEmails(String quem){
        int conta = 0;

        for (Email email : itens) {
            if ( email.getPara().equals(quem)) {
                conta++;
            }
        }
        return conta;
    }

    public Email getSeguinteEmail(String quem){
         Iterator<Email> it = itens.iterator();
         while ( it.hasNext()) {
            Email email = it.next();
            if ( email.getPara().equals( quem )) {
                it.remove();
                return email;
            }
         }
         return null;
         
    }

    public void post( Email email){
        itens.add( email );
    }
}
