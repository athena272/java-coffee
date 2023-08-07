package questao03;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();

        // Test operations
        for (int i = 1; i <= 15; i++) {
            int operation = i % 4; // Cycle through create, read, update, delete

            new Thread(() -> {
                try {
                    switch (operation) {
                        case 0:
                            database.create();
                            break;
                        case 1:
                            database.read();
                            break;
                        case 2:
                            database.update();
                            break;
                        case 3:
                            database.delete();
                            break;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}