
public class Exercicio4 {
    private static int valor = 0;

    public static void increment() {
        valor = valor + 1;
    }

    public static void main(String[] args) {
        int numThreads = 16;
        int numIterations = 10000;

        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < numIterations; j++) {
                    increment();
                }
            });
        }

        for (Thread thread : threads) {
            thread.start();
        }

        // Aguarda todas as threads terminarem
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Verifica o valor final
        int valorEsperado = numThreads * numIterations;
        System.out.println("Valor final: " + valor);
        System.out.println("Valor esperado: " + valorEsperado);
        System.out.println("O valor está correto? " + (valor == valorEsperado));
    }
}
