import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Date;

public class Principal {

    public static void main(String[] args) {
        // n clientes
        // m mensagens onde 0 < m < 10
        // conteudo das mensagens a hora em milisegundos
        ServidorEmail servidor;
        List<ClienteEmail> clientes;
        Random aleatorio;
        long lDateTime;
        int n;          //clientes
        int m;
        int qtos;
        int n_aleatorio;

        servidor = new ServidorEmail();
        clientes = new ArrayList<>();
        aleatorio = new Random();
        n = 5;          //clientes. Pode alterar a vontade!
    

        //inicializar todos os n clientes
        for (int i = 1; i <= n; i++)
            clientes.add( new ClienteEmail(servidor, "cliente" + i ) );
        
        //enviar as mensagens as m mensagens de cada cliente
        for (int i = 0; i < n; i++){        //cada cliente n
            m = aleatorio.nextInt(9)+1;     // 0 < m < 10
            for (int j = 0; j < m; j++) {   // m mensagens
                n_aleatorio = aleatorio.nextInt(n)+1; //destinatario aleatorio
                lDateTime = new Date().getTime() + j; //hora em milisegundos + j
                clientes.get(i).enviarEmail("cliente" + n_aleatorio, "mensagem: " + lDateTime + " milisegundos");
            }
        }

        //imprimir os emails que chegaram para cada cliente
        for (int i = 0; i < n; i++){
            qtos = servidor.quantosEmails( clientes.get(i).getUsuario() );
            for (int j = 0; j < qtos; j++) clientes.get(i).imprimirSeguinteEmail();
        }



            
    }

}
