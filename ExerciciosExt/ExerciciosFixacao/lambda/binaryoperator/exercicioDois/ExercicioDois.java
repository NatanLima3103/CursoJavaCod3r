package lambda.binaryoperator.exercicioDois;

import java.util.function.BinaryOperator;

public class ExercicioDois {

    public static Double combinarNotas (Double escrita, Double oral, BinaryOperator<Double> regra){
        return regra.apply(escrita, oral);
    }

    public static void main(String[] args) {
        BinaryOperator<Double> media = (a, b) -> (a + b) / 2;

        BinaryOperator<Double> maiorNota = (a, b) -> {
            if (a > b){
                return a;
            }
            return b;
        };

        Double escrita = 8.0;
        Double oral = 6.0;

        Double resultadoMedia = combinarNotas(escrita, oral, media);

        System.out.println("Média: " + resultadoMedia);

        System.out.println("Maior nota: " + combinarNotas(escrita, oral, maiorNota));

        System.out.println("Pontuação total: " + combinarNotas(escrita, oral, (a, b) -> (a + b)));
    }
}
