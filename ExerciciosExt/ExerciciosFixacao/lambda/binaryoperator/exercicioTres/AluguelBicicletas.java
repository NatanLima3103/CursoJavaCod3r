package lambda.binaryoperator.exercicioTres;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class AluguelBicicletas {

    public static void imprimirAluguel(List<Bicicleta> bicicletas, Integer horas, BiFunction<Bicicleta, Integer, Double> calcular){
        for (Bicicleta bike : bicicletas){
            Double valor = calcular.apply(bike, horas);
            System.out.println(bike.getModelo() + ": R$ " + valor);
        }
    }

    public static void main(String[] args) {

        List<Bicicleta> bicicletas = new ArrayList<>();

        bicicletas.add(new Bicicleta("Urbana", 10.0));
        bicicletas.add(new Bicicleta("Mountain Bike", 15.0));
        bicicletas.add(new Bicicleta("Elétrica", 25.0));

        BiFunction<Bicicleta, Integer, Double> precoNormal = (bike, horas) -> bike.getPrecoHora() * horas;

        BiFunction<Bicicleta, Integer, Double> precoComDesconto = (bike, horas) -> {
            Double total = bike.getPrecoHora() * horas;

            if (horas >= 3){
                return total * 0.9;
            }
            return total;
        };

        System.out.println("--- Preço normal (2h) ---");
        imprimirAluguel(bicicletas, 2, precoNormal);

        System.out.println("--- Com desconto (3h) ---");
        imprimirAluguel(bicicletas, 3, precoComDesconto);
    }
}
