package questao04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Airport airport = new Airport();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite 'p' para informar que uma aeronave deseja pousar,");
            System.out.println("Digite 'd' para informar que uma aeronave deseja decolar:");
            System.out.println("================================================");
            String choice = scanner.next();

            if (choice.equalsIgnoreCase("p")) {
                String flight = "Voo " + (int) (Math.random() * 100);
                new Thread(() -> {
                    try {
                        airport.land(flight);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }).start();
            } else if (choice.equalsIgnoreCase("d")) {
                String flight = "Voo " + (int) (Math.random() * 100);
                new Thread(() -> {
                    try {
                        airport.takeoff(flight);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }).start();
            } else {
                System.out.println("Escolha inválida. Digite 'p' ou 'd'.");
            }
        }
    }
}