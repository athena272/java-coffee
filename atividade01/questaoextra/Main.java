package questaoextra;

public class Main {
    public static void main(String[] args) {
        LeitorEscritor leitorEscritor = new LeitorEscritor();

        Thread[] leitores = new Thread[5];
        Thread[] escritores = new Thread[3];

        for (int i = 0; i < leitores.length; i++) {
            leitores[i] = new Thread(() -> {
                try {
                    leitorEscritor.iniciarLeitura();
                    System.out.println("Leitor está lendo...");
                    Thread.sleep(1000); // Simula a leitura
                    System.out.println("Leitor terminou de ler.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        for (int i = 0; i < escritores.length; i++) {
            escritores[i] = new Thread(() -> {
                try {
                    leitorEscritor.iniciarEscrita();
                    System.out.println("Escritor está escrevendo...");
                    Thread.sleep(2000); // Simula a escrita
                    System.out.println("Escritor terminou de escrever.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        for (Thread leitor : leitores) {
            leitor.start();
        }

        for (Thread escritor : escritores) {
            escritor.start();
        }

        for (Thread leitor : leitores) {
            try {
                leitor.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (Thread escritor : escritores) {
            try {
                escritor.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

