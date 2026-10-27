package lambda.exercicioDozeMaisUm;

@FunctionalInterface
public interface TaxaEntrega {

    double calcular(Pedido pedido);
}
