package lambda.function.exercicioQuatro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ExercicioQuatro {

    public static double converter(Double temperatura, Function<Double, Double> regra){
        return regra.apply(temperatura);
    }

    public static void main(String[] args) {
        Function<Double, Double> celsiusParaFahrenheit = t -> t * 1.8 + 32;
        Function<Double, Double> celsiusParaKelvin = t -> t + 273.15;

        List<Double> temperaturas = new ArrayList<>();

        temperaturas.add(0.0);
        temperaturas.add(25.0);
        temperaturas.add(100.0);

        temperaturas.forEach(temperatura -> System.out.println(temperatura + "°C = " +
                converter(temperatura, celsiusParaFahrenheit) + "°F | " + converter(temperatura, celsiusParaKelvin) + " K"));

        System.out.println("Sensação térmica: " + converter(25.0, celsius -> celsius - 10) + "°C");
    }
}
