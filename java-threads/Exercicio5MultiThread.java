
public class Exercicio5MultiThread {
    private static final int NUM_THREADS = 4;

    private static class DivisorsTask implements Runnable {
        private int start;
        private int end;
        private int[] maxDivisorsData;

        public DivisorsTask(int start, int end, int[] maxDivisorsData) {
            this.start = start;
            this.end = end;
            this.maxDivisorsData = maxDivisorsData;
        }

        @Override
        public void run() {
            int maxDivisors = 1;
            int maxDivisorsNumber = 1;

            for (int i = start; i <= end; i++) {
                int currentDivisors = countDivisors(i);
                if (currentDivisors > maxDivisors) {
                    maxDivisors = currentDivisors;
                    maxDivisorsNumber = i;
                }
            }

            synchronized (maxDivisorsData) {
                if (maxDivisors > maxDivisorsData[0]) {
                    maxDivisorsData[0] = maxDivisors;
                    maxDivisorsData[1] = maxDivisorsNumber;
                }
            }
        }

        private int countDivisors(int number) {
            int count = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int start = 1;
        int end = 20000;

        int[] maxDivisorsData = new int[]{1, 1};

        Thread[] threads = new Thread[NUM_THREADS];

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < NUM_THREADS; i++) {
            int threadStart = start + (i * (end - start) / NUM_THREADS);
            int threadEnd = start + ((i + 1) * (end - start) / NUM_THREADS) - 1;
            threads[i] = new Thread(new DivisorsTask(threadStart, threadEnd, maxDivisorsData));
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Versão Multithread");
        System.out.println("Número com mais divisores: " + maxDivisorsData[1]);
        System.out.println("Quantidade de divisores: " + maxDivisorsData[0]);
        System.out.println("Tempo total de execução (em milissegundos): " + (endTime - startTime));
    }
}
