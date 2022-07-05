public class Program {
    public static void main(String[] args)
    {
        String conta = "00234-2333";
        int posicao = 0;

        while (posicao < conta.length())
        {
            char c = conta.charAt(posicao);

            if (c == '-') {
                break;
            }

            posicao++;
        }

        System.out.println(conta.substring(0, posicao));
    }

}
