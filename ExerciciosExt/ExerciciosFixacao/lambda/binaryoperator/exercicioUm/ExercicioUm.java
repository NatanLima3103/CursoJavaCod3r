package lambda.binaryoperator.exercicioUm;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class ExercicioUm {

    public static void main(String[] args) {
        BiFunction<Double, Double, Double> calcularValor = (litros, precoLitro) -> litros * precoLitro;

        BinaryOperator<Double> somarAbastecimentos = (a, b) -> a + b;

        BiFunction<String, Double, String> gerarCupom = (placa, valor) -> "Placa " + placa + " | Total: R$ " + valor;

        Double valor1 = calcularValor.apply(40.0, 6.0);

        System.out.println("Valor do abastecimento: R$ " + valor1);

        Double totalDia = somarAbastecimentos.apply(valor1, 150.0);

        System.out.println("Total do dia: R$ " + totalDia);

        System.out.println(gerarCupom.apply("ABC1D23", totalDia));
    }
}
