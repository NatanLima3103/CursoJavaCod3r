package oo.polimorfismo.exercicioDez;

import java.util.ArrayList;
import java.util.List;

public class Arena {
    private List<Personagem> lutadores = new ArrayList<>();

    public void adicionarPersonagem(Personagem p){
        lutadores.add(p);
    }

    public void atacar(Personagem atacatante, Personagem alvo){
        if (atacatante.estaVivo()){
            int dano = atacatante.calcularDano();
            alvo.receberDado(dano);
        }
    }

    public int contarVivos(){
        int lutadoresVivos = 0;
        for (Personagem p : lutadores){
            if (p.estaVivo()){
                lutadoresVivos++;
            }
        }
        return lutadoresVivos;
    }

    public Personagem encontrarComMaisVida(){
        Personagem maiorVida = lutadores.get(0);
        for (Personagem p : lutadores){
            if (p.getVida() > maiorVida.getVida()){
                maiorVida = p;
            }
        }
        return maiorVida;
    }
}
