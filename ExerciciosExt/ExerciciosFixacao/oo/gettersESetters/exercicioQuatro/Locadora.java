package oo.gettersESetters.exercicioQuatro;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Locadora {
    public static void main(String[] args) {

        Veiculo onix = new Veiculo("ABC-1234", "Ônix", 120.0);
        Veiculo hb20 = new Veiculo("DEF-5678", "HB20", 110.0);
        Veiculo symbol = new Veiculo("GHI-9012", "Symbol", 250.0);

        onix.setDiaria(135.0);

//        onix.setPlaca("XXX-0000");

        ArrayList<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(onix);
        veiculos.add(hb20);
        veiculos.add(symbol);

        double somaDiaria = 0;
        int contador = 0;

        for(Veiculo v : veiculos){
            somaDiaria = somaDiaria + v.getDiaria();
            contador++;
            System.out.println("Placa: " + v.getPlaca() + ", modelo: " + v.getModelo() + ", valor diária: " + v.getDiaria());
        }

        double media = somaDiaria / contador;
        System.out.println("Valores totais diárias: " + somaDiaria);
        System.out.println("Média das diárias: " + media);
    }
}
