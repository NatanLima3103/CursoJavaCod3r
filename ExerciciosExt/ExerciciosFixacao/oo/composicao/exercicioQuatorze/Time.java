package oo.composicao.exercicioQuatorze;

import java.util.ArrayList;
import java.util.List;

public class Time {

    String nome;
    Tecnico tecnico;
    List<Jogador> jogadores = new ArrayList<>();

    Time(String nome, Tecnico tecnico){

        this.nome = nome;
        this.tecnico = tecnico;
    }

    void adicionarJogador(Jogador jogador){

        jogadores.add(jogador);
    }

    int totalGols(){
        int somaGols = 0;

        for(Jogador jogador : jogadores){

            somaGols = somaGols + jogador.gols;
        }

        return somaGols;
    }

    String artilheiro(){
        int maiorGols = 0;
        String nomeArtilheiro = "Sem jogadores";
        for (Jogador jogador : jogadores){
            if(jogador.gols > maiorGols){
                maiorGols = jogador.gols;
                nomeArtilheiro = jogador.nome;
            }
        }
        return nomeArtilheiro;
    }

    int contarComGolsMinimos(int minimo){
        int contador = 0;

        for(Jogador jogador : jogadores){

            if (jogador.gols >= minimo){
                contador++;
            }
        }
        return contador;
    }

    String descrever(){
        return nome + " (técnico " + tecnico.nome + ", " + tecnico.titulos + " títulos): " + jogadores.size() + " jogadores, " + totalGols() + " gols.";
    }
}
