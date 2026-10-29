package lambda.interfacesProprias.exercicioDozeMaisUm;

@FunctionalInterface
public interface TaxaEntrega {

    double calcular(Pedido pedido);
}
