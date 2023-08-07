package questao04;

import java.util.concurrent.Semaphore;

class Airport {
    private Semaphore runway = new Semaphore(1);
    private Semaphore takeoffQueue = new Semaphore(6);
    private Semaphore landingQueue = new Semaphore(3);

    public void takeoff(String flight) throws InterruptedException {
        takeoffQueue.acquire();
        System.out.println(flight + " está aguardando para decolar.");

        runway.acquire();
        System.out.println(flight + " está decolando.");
        Thread.sleep(1000); // Simulating takeoff operation
        System.out.println(flight + " decolou.");
        runway.release();

        takeoffQueue.release();
    }

    public void land(String flight) throws InterruptedException {
        landingQueue.acquire();
        System.out.println(flight + " está aguardando para pousar.");

        runway.acquire();
        System.out.println(flight + " está pousando.");
        Thread.sleep(1000); // Simulating landing operation
        System.out.println(flight + " pousou.");
        runway.release();

        landingQueue.release();
    }
}
