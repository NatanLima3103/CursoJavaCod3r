package oo.composicao.exercicioQuatorze;

public class Jogador {

    String nome;
    int gols;

    Jogador(String nome, int gols){

        this.nome = nome;
        this.gols = gols;
    }

    void marcarGol(){

        gols = gols + 1;
    }
}
