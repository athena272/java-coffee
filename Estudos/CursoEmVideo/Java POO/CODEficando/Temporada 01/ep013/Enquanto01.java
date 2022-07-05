package ep013;

public class Enquanto01 {
    public static void main(String[] args) {
        double lucca = 1.2;
        double tulio = 1.1;
        int anos = 0;
        while (lucca > tulio) {
            anos++;
            lucca += 0.02;
            tulio += 0.03;
        }
        System.out.println("Túlio ficará maior que Lucca em " + anos +" anos");
    }
}
