package oo.polimorfismo.exercicioUm;

import java.util.ArrayList;
import java.util.List;

public class ExercicioUmTeste {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro("ABC-1234"));
        veiculos.add(new Moto("XYZ-9876"));
        veiculos.add(new Caminhao("CAM-5555", 3));

        double somaPedagios = 0;

        for(Veiculo v : veiculos){
            double valor = v.calcularPedagio();
            System.out.println("A placa do veículo é: " + v.getPlaca() + ", o valor do pedágio ficou em: " + valor);

            somaPedagios += valor;
        }

        System.out.println("O valor de todos os veículos que passaram pelo pedágio ficou em: " + somaPedagios);
    }
}
