import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String passwd = teclado.next();


    }

    public boolean checkPasswd(String senha)
    {
        boolean isValide = true;
        if(senha.length() > 6)
        {
            isValide = false;
        }
        //Out of range
        else if (Integer.parseInt(senha) < 184759 || Integer.parseInt(senha) > 856920)
        {
            isValide = false;
        }
        else if ()
        {

        }
        return  isValide;
    }

    public boolean estaCrescente(String numeros)
    {
        int posicao = 0;

        while (posicao < numeros.length())
        {
            char num = numeros.charAt(posicao);

            if (Integer.parseInt(String.valueOf(num)) > '-') {
                break;
            }

            posicao++;
        }
    }
}


