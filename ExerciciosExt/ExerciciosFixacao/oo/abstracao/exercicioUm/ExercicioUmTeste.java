package oo.abstracao.exercicioUm;

import java.util.ArrayList;
import java.util.List;

public class ExercicioUmTeste {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro("ABC-1234"));
        veiculos.add(new Moto("MOT-5678"));
        veiculos.add(new Caminhao("CAM-9012", 3));

        double arrecadacao = 0;

        for (Veiculo veiculo : veiculos){
            double pedagio = veiculo.calcularPedagio();
            System.out.println(veiculo.identificar() + " | Pedágio: R$ " + pedagio);
            arrecadacao += pedagio;
        }
        System.out.println("Total arrecadado R$ " + arrecadacao);
    }
}
