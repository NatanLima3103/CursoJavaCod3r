package lambda.unaryoperator.exercicioQuatro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class ExercicioQuatro {

    public static Double aplicarEtapas(Double preco, List<UnaryOperator<Double>> etapas){
        for (UnaryOperator<Double> etapa : etapas){
            preco = etapa.apply(preco);
        }
        return preco;
    }

    public static void main(String[] args) {
        UnaryOperator<Double> cupom = preco -> preco - 10.0;
        UnaryOperator<Double> descontoExtra = preco -> {
            if (preco > 100.0){
                return preco - 20.0;
            }
            return preco;
        };
        UnaryOperator<Double> frete = preco -> preco + 15.0;

        List<UnaryOperator<Double>> etapas = new ArrayList<>();

        etapas.add(cupom);
        etapas.add(descontoExtra);
        etapas.add(frete);

        List<Double> precos = new ArrayList<>();

        precos.add(150.0);
        precos.add(80.0);
        precos.add(110.0);

        for (Double preco : precos){
            System.out.println("R$ " + preco + " -> R$ " + aplicarEtapas(preco, etapas));
        }
    }
}
