package lambda.unaryoperator.exercicioDois;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class ExercicioDois {

    public static Double reajustar(Double valor, UnaryOperator<Double> regra){
        return regra.apply(valor);
    }

    public static void main(String[] args) {
        List<Double> precos = new ArrayList<>();

        precos.add(10.0);
        precos.add(25.0);
        precos.add(50.0);

        UnaryOperator<Double> taxaFixa = preco -> preco + 2.0;
        UnaryOperator<Double> metade = preco -> preco / 2.0;

        for (Double preco: precos){

            System.out.println("R$ " + preco + " | taxa: R$ " + reajustar(preco, taxaFixa) + " | metade: R$ " + reajustar(preco, metade));

        }

        System.out.println("Direto: R$ " + reajustar(10.0, valor -> valor - 1.0));
    }
}
