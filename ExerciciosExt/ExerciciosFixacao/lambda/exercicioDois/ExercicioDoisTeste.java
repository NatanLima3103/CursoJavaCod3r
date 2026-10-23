package lambda.exercicioDois;

public class ExercicioDoisTeste {

    public static void main(String[] args) {

        CalculoFrete freteEconomico = (pesoKg, distanciaKm) -> pesoKg * 2 + distanciaKm * 0.5;

        CalculoFrete freteExpresso = (pesoKg, distanciaKm) -> {
            double calculo = pesoKg * 3 + distanciaKm * 1.5;

            if (pesoKg > 30){
                calculo += 25;
                return calculo;
            }
            return calculo;
        };

        double pesoKg = 10;
        double distanciaKm = 100;

        System.out.println("Peso: " + pesoKg + " | Dist: " + distanciaKm + " | Econônimica: " + freteEconomico.calcular(pesoKg, distanciaKm) + " | Expresso: " + freteExpresso.calcular(pesoKg, distanciaKm));

        pesoKg = 40;
        distanciaKm = 200;

        System.out.println("Peso: " + pesoKg + " | Dist: " + distanciaKm + " | Econônimica: " + freteEconomico.calcular(pesoKg, distanciaKm) + " | Expresso: " + freteExpresso.calcular(pesoKg, distanciaKm));
    }
}
