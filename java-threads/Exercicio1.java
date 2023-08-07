
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {
    private static class OrdenacaoThread extends Thread {
        private int[] vetor;

        public OrdenacaoThread(int[] vetor) {
            this.vetor = vetor;
        }

        @Override
        public void run() {
            System.out.println("Vetor original: " + Arrays.toString(vetor));

            // Ordena o vetor usando o algoritmo de ordenação de sua escolha
            Arrays.sort(vetor);

            System.out.println("Vetor ordenado: " + Arrays.toString(vetor));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Digite o tamanho do vetor: ");
            int tamanho = scanner.nextInt();

            int[] vetor = new int[tamanho];
            System.out.println("Digite os " + tamanho + " elementos do vetor:");

            for (int i = 0; i < tamanho; i++) {
                vetor[i] = scanner.nextInt();
            }

            OrdenacaoThread ordenacaoThread = new OrdenacaoThread(vetor);
            ordenacaoThread.start();

            // Espera a thread de ordenação concluir antes de continuar
            try {
                ordenacaoThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.print("Deseja informar outro vetor? (S/N): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        scanner.close();
    }
}