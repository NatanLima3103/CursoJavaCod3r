package lambda.binaryoperator.exercicioQuatro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class ArmazemCaixas {

    public static Integer acumular(List<Integer> valores, Integer inicial, BinaryOperator<Integer> regra){
        Integer resultado = inicial;

        for (Integer valor : valores){
            resultado = regra.apply(resultado, valor);
        }
        return resultado;
    }

    public static void main(String[] args) {
        List<Integer> caixas = new ArrayList<>();

        caixas.add(40);
        caixas.add(75);
        caixas.add(30);
        caixas.add(60);
        caixas.add(55);

        BinaryOperator<Integer> somar = (acumulado, atual) -> acumulado + atual;

        BinaryOperator<Integer> maior = (acumulado, atual) -> {
            if (atual > acumulado){
                return atual;
            }
            return acumulado;
        };

        BinaryOperator<Integer> contarAcimaDe50 = (acumulado, atual) -> {
            if (atual > 50){
                return acumulado + 1;
            }
            return acumulado;
        };

        System.out.println("Total de caixas na semana: " + acumular(caixas, 0, somar));

        System.out.println("Maior entrada: " + acumular(caixas, 0, maior));

        System.out.println("Dias com mais de 50 caixas: " + acumular(caixas, 0, contarAcimaDe50));
    }
}
