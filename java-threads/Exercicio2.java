
import java.util.Date;

public class Exercicio2 {
    private static class MinhaThread extends Thread {
        private int threadNumber;

        public MinhaThread(int threadNumber) {
            this.threadNumber = threadNumber;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Olá, sou a Thread número " + threadNumber + "!");
                try {
                    Thread.sleep(100); // Adiciona um pequeno atraso para fins de demonstração
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Date startTime = new Date();

        MinhaThread thread1 = new MinhaThread(1);
        MinhaThread thread2 = new MinhaThread(2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Date endTime = new Date();
        System.out.println("Horário de início de todas as threads: " + startTime);
        System.out.println("Horário de término de todas as threads: " + endTime);

        String primeiraThreadConcluida = thread1.isAlive() ? "Thread 2" : "Thread 1";
        System.out.println("A primeira thread a concluir foi: " + primeiraThreadConcluida);

        long tempoDeExecucao = endTime.getTime() - startTime.getTime();
        System.out.println("Tempo total de execução (em milissegundos): " + tempoDeExecucao);
    }
}
