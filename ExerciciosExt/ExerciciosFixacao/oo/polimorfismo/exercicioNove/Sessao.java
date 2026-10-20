package oo.polimorfismo.exercicioNove;

import java.util.ArrayList;
import java.util.List;

public class Sessao {

    private String filme;
    private List<Ingresso> ingressos = new ArrayList<>();

    public Sessao(String filme){
        this.filme = filme;
    }

    public void vender(Ingresso ingresso){
        ingressos.add(ingresso);
    }

    public int contarIngressos(){
        return ingressos.size();
    }

    public int contarPagantes(){
        int contadorPagantes = 0;
        for (Ingresso i : ingressos){
            if (i.calcularPreco() > 0){
                contadorPagantes++;
            }
        }
        return contadorPagantes;
    }

    public double calcularArrecadacao(){
        double soma = 0;
        for (Ingresso i : ingressos){
            soma += i.calcularPreco();
        }
        return soma;
    }
}
