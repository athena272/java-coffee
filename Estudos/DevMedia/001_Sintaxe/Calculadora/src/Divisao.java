import java.math.BigDecimal;

public class Divisao implements Operacao
{
    @Override
    public BigDecimal calcular(BigDecimal value1, BigDecimal value2)
    {
        BigDecimal resultado = null;
        // se qualquer um dos operadores for nulo retornaremos null
        if (value1 == null || value2 == null)
        {
            resultado = null;
        } else
        {
            // ... se nenhum dos operadores for nulo, verificamos ainda
            // se o divisor é diferente de ZERO para realizar a operação.
            // Se o divisor for igual a ZERO, retornaremos nulo.
            resultado = (value2.compareTo(new BigDecimal(0)) == 0 ? null : value1.divide(value2, 3,
                    BigDecimal.ROUND_HALF_UP));
        }
        return resultado;
    }
}
