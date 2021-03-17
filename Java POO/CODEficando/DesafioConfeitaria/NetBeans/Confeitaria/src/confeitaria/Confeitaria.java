package confeitaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class Confeitaria {

    public static void main(String[] args) {
        //Criar uma entrada de dados
        Scanner teclado = new Scanner(System.in);
        //Lista de pedios
        List<Pedido> pedidos = new ArrayList<Pedido>(); 
        //Variavel para a escolha das opcoes
        byte escolha = 0;
        int numero_pedidos = 0;
        do {
            //Menu interativo
            System.out.println("=== ATENDIMENTO CONFEITARIA ===");
            System.out.println("[1] para ver Lista de Pedidos");
            System.out.println("[2] Adicionar um pedido");
            System.out.println("[3] Atualizar um pedido");
            System.out.println("[4] Remover um pedido");
            System.out.println("[0] Encerrar o atendimento");
            System.out.println("===============================");
            System.out.print("Digite a opção que deseja: ");
            //Variavel de opçao
            escolha = teclado.nextByte();
            //Escolher a ação co switch case
            switch(escolha) {
                case 0:
                    continue;//Sair do laço
                
                case 1:
                    for(byte i = 0; i <= pedidos.lastIndexOf(i); i++) {
                        System.out.println(pedidos.get(i));
                    }
                case 2:
                    Pedido pd = new Pedido();
                    pd.adicionarPedios();
                    pedidos.add(pd);
            }
        
        } while(escolha != 0);   
        System.out.println("OBRIGADO PELA PREFERÊNCIA, VOLTE SEMPRE!!!");
       
    }   
    
}
