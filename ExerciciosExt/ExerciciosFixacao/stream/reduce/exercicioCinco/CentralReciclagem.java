package stream.reduce.exercicioCinco;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class CentralReciclagem {

    public static Double fechar(List<Double> pesos, Double inicial, BinaryOperator<Double> regra){

        return pesos.stream().reduce(inicial, regra);
    }

    public static void main(String[] args) {
        List<Double> pesos = new ArrayList<>();

        pesos.add(12.5);
        pesos.add(8.0);
        pesos.add(20.5);
        pesos.add(15.0);

        BinaryOperator<Double> somar = (a, b) -> a + b;
        BinaryOperator<Double> maisPesado = (a, b) -> a > b? a : b;
        BinaryOperator<Double> maisLeve = (a, b) -> a < b? a : b;

        System.out.println("=== CENTRAL DE RECICLAGEM ===");
        double pesoTotal = fechar(pesos, 0.0, somar);
        System.out.println("Peso total: " + pesoTotal + " kg");

        double maiorFardo = fechar(pesos, 0.0, maisPesado);
        System.out.println("Fardo mais pesado: " + maiorFardo + " kg");

        double menorFardo = fechar(pesos, pesos.get(0), maisLeve);
        System.out.println("Fardo mais leve: " + menorFardo + " kg");

        double fardosGrandes = fechar(pesos, 0.0, (a, i) -> i > 10.0? a + 1 : a);
        System.out.println("Fardos acima de 10kg: " + fardosGrandes);
    }
}
