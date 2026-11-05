package lambda.function.exercicioUm;

import lambda.predicate.exercicioSeis.Funcionario;

import java.util.function.Function;

public class ExercicioUm {

    public static void main(String[] args) {
        Function<Double, Double> reaisParaDolar = valor -> valor / 5.00;

        System.out.println(reaisParaDolar.apply(100.0));
        System.out.println(reaisParaDolar.apply(250.0));
        System.out.println(reaisParaDolar.apply(0.0));

        Function<Double, String> formatarRecibo = valor -> "US$ " + valor;

        System.out.println(formatarRecibo.apply(reaisParaDolar.apply(100.0)));
        System.out.println(formatarRecibo.apply(reaisParaDolar.apply(250.0)));
        System.out.println(formatarRecibo.apply(reaisParaDolar.apply(0.0)));
    }
}
