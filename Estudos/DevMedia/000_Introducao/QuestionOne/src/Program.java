import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String passwd = teclado.next();
        System.out.println("Senha válida?: " + checkPasswd(passwd));


    }

    public static boolean checkPasswd(String senha)
    {
        boolean isValide = true;

        if(senha.length() != 6)
        {
            isValide = false;
        }
        //Out of range
        else if (Integer.parseInt(senha) < 184759 || Integer.parseInt(senha) > 856920)
        {
            isValide = false;
        }
        else if (!estaCrescente(senha))
        {
            isValide = false;
        }
        return  isValide;
    }

    public static boolean estaCrescente(String numeros)
    {
        int posicao = 0;

        while (posicao < (numeros.length() - 2))
        {
            char num = numeros.charAt(posicao);
            char nextNum = numeros.charAt(posicao + 1);

            if (num > nextNum)
            {
                return false;
            }
            posicao++;
        }

        return true;
    }
}


