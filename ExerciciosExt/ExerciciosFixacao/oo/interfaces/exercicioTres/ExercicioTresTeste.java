package oo.interfaces.exercicioTres;

import java.util.ArrayList;
import java.util.List;

public class ExercicioTresTeste {
    public static void main(String[] args) {
        List<Frete> lista = new ArrayList<>();

        lista.add(new Sedex());
        lista.add(new Pac());
        lista.add(new Transportadora("RapidoBR"));

        double peso = 4;

        double menorPreco = Double.MAX_VALUE;
        String nomeMaisBarato = "";

        for (Frete f : lista){
            double preco = f.calcular(peso);
            System.out.println(f.getNome() + ": R$" + preco);

            if(preco < menorPreco){
                menorPreco = preco;
                nomeMaisBarato = f.getNome();
            }
        }
        System.out.println("Mais barato: " + nomeMaisBarato + " (R$ " + menorPreco + ")");
    }
}
