public interface Promocional {
    boolean aplicaDescontoDe(double porcentagem);

    default boolean aplicaDescontoDe10Porcento(double porcentagem) {
        return aplicaDescontoDe(0.1);
    }
}
