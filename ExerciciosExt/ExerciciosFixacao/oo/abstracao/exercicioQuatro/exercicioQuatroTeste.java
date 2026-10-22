package oo.abstracao.exercicioQuatro;

import java.util.ArrayList;
import java.util.List;

public class exercicioQuatroTeste {
    public static void main(String[] args) {
        List<Ingresso> ingressos = new ArrayList<>();

        ingressos.add(new Inteira("Rock fest", 100));
        ingressos.add(new Meia("Rock fest", 100));
        ingressos.add(new Vip("Rock Fest", 100, 150));
        ingressos.add(new Meia("Teatro", 80));

        double precoTotal = 0;
        int qtdCaros = 0;

        for ( Ingresso ingresso : ingressos){
            double preco = ingresso.calcularPreco();
            System.out.println(ingresso.descrever() + " | R$ " + preco);
            precoTotal += preco;

            if (preco >= 100){
                qtdCaros++;
            }
        }

        System.out.println("Total: R$ " + precoTotal);
        System.out.println("Ingressos de R$ 100,00 ou mais: " + qtdCaros);
    }
}
