public class Program {
    public static void main(String[] args) {
        RelogioDigital relogioDigital = new RelogioDigital();
        relogioDigital.setTempo(19, 12);
        System.out.println(relogioDigital.getTempo());
    }
}