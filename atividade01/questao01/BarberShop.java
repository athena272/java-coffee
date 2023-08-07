package questao01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class BarberShop {
    private static final int MAX_QUEUE_SIZE = 10;
    private static final int MIN_HAIRCUT_TIME = 5000; // 5 seconds
    private static final int MAX_HAIRCUT_TIME = 10000; // 10 seconds
    private static final int MIN_ARRIVAL_TIME = 4000; // 4 seconds
    private static final int MAX_ARRIVAL_TIME = 6000; // 6 seconds

    private Queue<Integer> queue = new LinkedList<>();
    private int numCustomers = 0;

    private class Barber extends Thread {
        private int id;

        public Barber(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            while (true) {
                int customer;
                synchronized (queue) {
                    while (queue.isEmpty()) {
                        try {
                            System.out.println("Barber " + id + " is sleeping...");
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    customer = queue.poll();
                }

                System.out.println("Barber " + id + " is cutting hair of customer " + customer);
                try {
                    Thread.sleep(getRandomHaircutTime());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Barber " + id + " finished cutting hair of customer " + customer);
            }
        }
    }

    private class CustomerGenerator extends Thread {
        @Override
        public void run() {
            while (true) {
                int customer = ++numCustomers;
                synchronized (queue) {
                    if (queue.size() < MAX_QUEUE_SIZE) {
                        queue.offer(customer);
                        System.out.println("Customer " + customer + " arrived.");
                        queue.notify();
                    } else {
                        System.out.println("Customer " + customer + " arrived but the queue is full.");
                    }
                }

                try {
                    Thread.sleep(getRandomArrivalTime());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private int getRandomHaircutTime() {
        return MIN_HAIRCUT_TIME + new Random().nextInt(MAX_HAIRCUT_TIME - MIN_HAIRCUT_TIME + 1);
    }

    private int getRandomArrivalTime() {
        return MIN_ARRIVAL_TIME + new Random().nextInt(MAX_ARRIVAL_TIME - MIN_ARRIVAL_TIME + 1);
    }

    public void start() {
        Barber barber1 = new Barber(1);
        Barber barber2 = new Barber(2);
        CustomerGenerator customerGenerator = new CustomerGenerator();

        barber1.start();
        barber2.start();
        customerGenerator.start();
    }

    public static void main(String[] args) {
        BarberShop barberShop = new BarberShop();
        barberShop.start();
    }
}
