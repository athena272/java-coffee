
public class Exercicio5MonoThread {
    public static void main(String[] args) {
        int start = 1;
        int end = 20000;

        long startTime = System.currentTimeMillis();
        int maxDivisorsNumber = findNumberWithMaxDivisors(start, end);
        int maxDivisors = countDivisors(maxDivisorsNumber);
        long endTime = System.currentTimeMillis();

        System.out.println("Versão Monothread");
        System.out.println("Número com mais divisores: " + maxDivisorsNumber);
        System.out.println("Quantidade de divisores: " + maxDivisors);
        System.out.println("Tempo total de execução (em milissegundos): " + (endTime - startTime));
    }

    private static int findNumberWithMaxDivisors(int start, int end) {
        int maxDivisorsNumber = 1;
        int maxDivisors = 1;

        for (int i = start; i <= end; i++) {
            int currentDivisors = countDivisors(i);
            if (currentDivisors > maxDivisors) {
                maxDivisors = currentDivisors;
                maxDivisorsNumber = i;
            }
        }

        return maxDivisorsNumber;
    }

    private static int countDivisors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }
}
