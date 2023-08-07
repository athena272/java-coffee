package questao03;

import java.util.concurrent.Semaphore;

class Database {
    private Semaphore querySemaphore = new Semaphore(10);
    private Semaphore operationSemaphore = new Semaphore(1);

    public void create() throws InterruptedException {
        querySemaphore.acquire();
        operationSemaphore.acquire();
        System.out.println("Creating...");
        Thread.sleep(1000); // Simulating database operation
        operationSemaphore.release();
        querySemaphore.release();
        System.out.println("Create operation completed.");
    }

    public void read() throws InterruptedException {
        querySemaphore.acquire();
        System.out.println("Reading...");
        Thread.sleep(1000); // Simulating database operation
        querySemaphore.release();
        System.out.println("Read operation completed.");
    }

    public void update() throws InterruptedException {
        querySemaphore.acquire();
        operationSemaphore.acquire();
        System.out.println("Updating...");
        Thread.sleep(1000); // Simulating database operation
        operationSemaphore.release();
        querySemaphore.release();
        System.out.println("Update operation completed.");
    }

    public void delete() throws InterruptedException {
        querySemaphore.acquire();
        operationSemaphore.acquire();
        System.out.println("Deleting...");
        Thread.sleep(1000); // Simulating database operation
        operationSemaphore.release();
        querySemaphore.release();
        System.out.println("Delete operation completed.");
    }
}


