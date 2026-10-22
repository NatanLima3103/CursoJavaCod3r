package oo.abstracao.exercicioTres;

import java.util.ArrayList;
import java.util.List;

public class exercicioTresTeste {
    public static void main(String[] args) {
        List<Comodo> comodos = new ArrayList<>();

        comodos.add(new Triangular("Varanda", 6, 3));
        comodos.add(new Retangular("Sala", 5, 4));
        comodos.add(new Trapezoidal("Cozinha", 8, 4, 3));

        double precoM2 = 50;
        double custoTotal = 0;
        double maiorComodo = 0;
        String nomeMaiorComodo = "Não foi possível verificar";

        for (Comodo comodo : comodos){
            System.out.println(comodo.getNome() + " | Àrea: " + comodo.calcularArea() + " m² | Custo: " + comodo.calcularCusto(precoM2));
            custoTotal += comodo.calcularCusto(precoM2);
            if (comodo.calcularArea() > maiorComodo){
                maiorComodo = comodo.calcularArea();
                nomeMaiorComodo = comodo.getNome();
            }
        }

        System.out.println("Custo total: R$ " + custoTotal);
        System.out.println("Maior cômodo: " + nomeMaiorComodo);
    }
}
