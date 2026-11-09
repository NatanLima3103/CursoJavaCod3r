package lambda.supplier.exercicioDois;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Bilheteria {

    public static void main(String[] args) {

        Supplier<Ingresso> fabricaIngresso = () -> new Ingresso("Festival de Verão", 80.0);

        List<Ingresso> vendidos = new ArrayList<>();

        for (int i = 0; i < 4; i++){
            vendidos.add(fabricaIngresso.get());
        }
        vendidos.get(1).setPreco(40.0);

        for (Ingresso ingresso : vendidos){
            System.out.println(ingresso.getEvento() + " - R$ " + ingresso.getPreco());
        }

        System.out.println("Mesmo objeto? " + (vendidos.get(0) == vendidos.get(2)));
    }
}
