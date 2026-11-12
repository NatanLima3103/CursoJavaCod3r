package lambda.binaryoperator.exercicioCinco;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Estacionamento {

    public static Double fecharCaixa(List<Veiculo> veiculos, Double valorHora, BiFunction<Veiculo, Double, Double> cobrar, BinaryOperator<Double> combinar){
        Double resultado = 0.0;

        for (Veiculo veiculo : veiculos){
            Double cobranca = cobrar.apply(veiculo, valorHora);
            resultado = combinar.apply(resultado, cobranca);
        }
        return resultado;
    }

    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Veiculo("ABC1D23", 2));
        veiculos.add(new Veiculo("XYZ9K87", 7));
        veiculos.add(new Veiculo("QWE4R56", 4));

        BiFunction<Veiculo, Double, Double> cobrarComTeto = (veiculo, valorHora) -> {
            if (veiculo.getHoras() > 5){
                return 5 * valorHora;
            }
            return veiculo.getHoras() * valorHora;
        };
        BinaryOperator<Double> somar = (acumulado, atual) -> acumulado + atual;
        BinaryOperator<Double> maior = (acumulado, atual) -> {
            if (atual > acumulado){
                return atual;
            }
            return acumulado;
        };

        System.out.println("Faturamento do dia: R$" + fecharCaixa(veiculos, 8.0, cobrarComTeto, somar));
        System.out.println("Maior cobrança: R$ " + fecharCaixa(veiculos, 8.0, cobrarComTeto, maior));
        System.out.println("Faturamento se fosse feriado (sem teto): R$ " + fecharCaixa(veiculos, 8.0, (veiculo, valorHora) -> veiculo.getHoras() * valorHora, somar));
    }
}
