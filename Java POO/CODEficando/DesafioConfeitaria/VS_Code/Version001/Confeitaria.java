
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Confeitaria
 */
public class Confeitaria {
    public static void main(String[] args) {
        //Criar uma entrada de dados
        Scanner teclado = new Scanner(System.in);
        //Lista de pedios
        List<Pedido> pedidos = new ArrayList<Pedido>(); 
        //Variavel para a escolha das opcoes
        byte escolha = 0;
        int pos_pedido = 1;
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
                    //Se não houver nenhum pedido
                    if(pedidos.isEmpty()) {
                        System.out.println("Ainda NÃO há pedidos");
                    } else { //Caso haja algum pedido
                        //Tipo/Objeto item : nome_lista
                        for (Pedido item : pedidos) {     
                            System.out.println("### " + pos_pedido++ + "º pedido ###");
                            System.out.println("Nome: " + item.getNome());
                            System.out.println("Telefone: " + item.getTelefone());
                            System.out.println("Endereço: " + item.getEndereco());
                            System.out.println("Sabor: " + item.getSabor());
                            System.out.println("Valor: " + item.getValor());
                            System.out.println("----------------------------");
                        }
                    }
                    break;
                case 2: //Adicionar pedido
                    Pedido pd = new Pedido();
                    pd.adicionarPedios();
                    pedidos.add(pd);
                    break;
                case 3: //Atualziar pedido
                    System.out.print("Informe o telefone do pedido: ");
                    String find_pedido = teclado.next();
                    //Encontrar número na lista
                    for(Pedido j : pedidos) {
                        if(j.getTelefone().equals(find_pedido)) {
                            System.out.println("Refaça o pedido...");
                            pd = new Pedido();
                            pd.adicionarPedios();
                            pedidos.add(pd);
                        }
                        else {
                            System.out.println("PEDIDO NÃO ENCONTRADO");
                        }
                    }
                        
                    break;
                
                case 4: //Remover pedido
                    if (pedidos.isEmpty()) { //Sem pedidos para remover
                        System.out.println("NÃO há pedidos para remover");
                    } else {
                        System.out.print("Veja a lista de pedidos e digite o "
                            + "número dele para remover: ");
                        int remo = teclado.nextInt();
                        pedidos.remove(remo - 1);
                    }
                    break;
            }
            
        
        } while(escolha != 0);   
        System.out.println("OBRIGADO PELA PREFERÊNCIA, VOLTE SEMPRE!!!");        
    }
    
}