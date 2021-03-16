package Version001;

import java.util.Scanner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        //Criar uma entrada de dados
        Scanner teclado = new Scanner(System.in);
        //Menu interativo
        System.out.println("=== ATENDIMENTO CONFEITARIA ===");
        System.out.println("[1] para ver Lista de Pedidos");
        System.out.println("[2] Adicionar um pedido");
        System.out.println("[3] Atualizar um pedido");
        System.out.println("[4] Remover um pedido");
        System.out.println("[0] Encerrar o atendimento");
        System.out.println("===============================");
        System.out.println("Digite a opção que deseja: ");
        //Variavel de opçao
        byte escolha = teclado.nextByte();
        
    }
}