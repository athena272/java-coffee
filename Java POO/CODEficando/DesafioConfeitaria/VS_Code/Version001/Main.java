package Version001;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        //Criar uma entrada de dados
        Scanner teclado = new Scanner(System.in);
        //Lista de Pedidos
        List lista = new ArrayList();
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
            //Switch para controle das opcoes
            switch (escolha) {
                case 0:
                        continue; //Sair do laço e encerrar programa
                case 1:
                    System.out.println("Você escolheu ver a LISTA DE PEDIDOS");
                    //ver a lista de pedidos
                    for(int i = 0; i < lista.size(); i++) {
                        System.out.println("Nome: " + lista.get());
                    }
                    break;

                case 2:
                    System.out.println("Você escolheu ADICIONAR UM PEDIDO");
                    numero_pedidos++;//Adicionar um pedido 
                    System.out.print("Informe seu nome: ");
                    String nome = teclado.next();
                    System.out.print("Informe seu telefone: ");
                    String telefone = teclado.next();
                    System.out.print("Informe seu endereço: ");
                    String endereco = teclado.next();
                    System.out.print("Informe o sabor: ");
                    String sabor = teclado.next();
                    System.out.print("Informe o valor: R$");
                    double valor = teclado.nextDouble();
                    //Criar objeto para receber cada ums dos atributos
                    AdicionarPedidos aP = new AdicionarPedidos(nome, telefone, endereco, sabor, valor);
                    //adicionar a lista
                    lista.add(aP);
                    break;

                case 3:
                    System.out.println("Você escolheu ATUALIZAR UM PEDIDO");
                
                case 4:
                    System.out.println("Você escolheu REMOVER UM PEDIDO");

                default:
                    System.out.println("[ERROR] A opção escolhida é INVÁLIDA, tente novamente");
                    break;
            }
        } while (escolha != 0);
        System.out.println("OBRIGADO PELA PREFERÊNCIA, VOLTE SEMPRE!!!");
    }
}