package ep009;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Entrada02 {
    public static void main(String[] args) {
        String lblNome = JOptionPane.showInputDialog("Nome: ");
        //String lblPeso = JOptionPane.showInputDialog("Peso: ");
        int lblPeso = Integer.parseInt(JOptionPane.showInputDialog("Peso: "));
        System.out.println(lblNome + " pesa " + lblPeso + "Kg");

    }
}
