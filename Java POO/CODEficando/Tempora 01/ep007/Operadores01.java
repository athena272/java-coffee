package ep007;

/**
 * Operadores
 */
public class Operadores01 {

    public static void main(String[] args) {
        double salarioBruto = (double) 3000;
        double aumento = salarioBruto * 1.2;
        double novoSalario = salarioBruto + aumento;
        double descontos = novoSalario - (salarioBruto * 0.1);
    }
}