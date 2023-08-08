package questao05;

import java.util.concurrent.Semaphore;

class LeitorEscritor {
    private int leitoresAtivos;
    private boolean escritorAtivo;
    private Semaphore mutexLeitor;
    private Semaphore mutexEscritor;
    private Semaphore db;

    public LeitorEscritor() {
        leitoresAtivos = 0;
        escritorAtivo = false;
        mutexLeitor = new Semaphore(1);
        mutexEscritor = new Semaphore(1);
        db = new Semaphore(1);
    }

    public void iniciarLeitura() throws InterruptedException {
        mutexLeitor.acquire();
        leitoresAtivos++;
        if (leitoresAtivos == 1) {
            db.acquire();
        }
        mutexLeitor.release();

        // Realiza leitura

        mutexLeitor.acquire();
        leitoresAtivos--;
        if (leitoresAtivos == 0) {
            db.release();
        }
        mutexLeitor.release();
    }

    public void iniciarEscrita() throws InterruptedException {
        mutexEscritor.acquire();
        while (escritorAtivo) {
            mutexEscritor.release();
            Thread.sleep(100); // Espera um pouco para tentar novamente
            mutexEscritor.acquire();
        }
        escritorAtivo = true;
        mutexEscritor.release();

        db.acquire();

        // Realiza escrita

        db.release();

        mutexEscritor.acquire();
        escritorAtivo = false;
        mutexEscritor.release();
    }
}
