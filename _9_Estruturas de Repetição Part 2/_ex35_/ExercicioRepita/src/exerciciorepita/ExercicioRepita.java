/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;
import javax.swing.JOptionPane;
/**
 *
 * @author guilh
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int valor, total_valores = 0, pares = 0, impares = 0, acima_100 = 0, m = 0, s = 0;
        do{
            valor = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um valor: <br><em>(valor 0 interrompe)</em></html>", "Entrada de dados", JOptionPane.WARNING_MESSAGE));
            //Saber quantos valores foram digitadoss
            if (valor != 0){
                total_valores += 1;
                //Saber os pares e ímpares
                if (valor % 2 == 0){
                    pares += 1;
                }
                else {
                    impares += 1;
                }
                //Valores acima de 100
                if (valor > 100) acima_100 += 1;
                //Media dos valores
                s += valor; //Primeiro somamos todos
            }    
        } while (valor != 0);
        //Agora tirar media
        m = (s / (total_valores));
        //Resultados
       JOptionPane.showMessageDialog(null, "<html>Resultados <br><hr>"
               + "<br> A soma dos valores foi: " + s + 
                 "<br> Total de pares: " + pares +
                 "<br> Total de ímpares: " + impares +
                 "<br> Valores acima de 100: " + acima_100 +
                 "<br> Média dos valores: " + m +
                 "</html>", "Resultado Final",JOptionPane.WARNING_MESSAGE);
    }
    
}
