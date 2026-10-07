package oo.herenca.exercicioOito;

import java.util.ArrayList;

public class ExercicioOitoTeste {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro("Symbol"));
        veiculos.add(new Moto("Hornet"));
        veiculos.add(new Caminhao("Fh", 12));
        veiculos.add(new Onibus("Volvo"));

        double total = 0;

        for(Veiculo veiculo : veiculos){

            total = total + veiculo.calcularPedagio();

            System.out.println(veiculo.descrever() + " -> pedágio: " + veiculo.calcularPedagio());
        }

        System.out.println("Total: " + total);
    }
}
