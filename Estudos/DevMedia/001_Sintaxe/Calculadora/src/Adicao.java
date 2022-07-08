import java.math.BigDecimal;

public class Adicao implements Operacao {

    @Override
    public BigDecimal calcular(BigDecimal value1, BigDecimal value2) {

        BigDecimal resultado = null;
        // se nenhum dos operadores for nulo
        resultado = (value1 != null && value2 != null ? value1.add(value2) : null);
        return resultado;
    }
}