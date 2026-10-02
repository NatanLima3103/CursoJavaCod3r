package oo.composicao.exercicioDez;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    String nome;
    List<Musica> musicas = new ArrayList<>();

    Playlist(String nome){
        this.nome = nome;
    }

    void adicionarMusica(Musica musica){

        musicas.add(musica);
    }

    int calcularDuracaoTotal(){
        int soma = 0;
        for(Musica musica : musicas){
            soma = soma + musica.duracao;
        }
        return soma;
    }

    String maisLonga(){
        int maiorDuracao = 0;
        String tituloMaisLonga = "Playlist vazia.";

        for(Musica musica : musicas){
            if (musica.duracao > maiorDuracao){

                maiorDuracao = musica.duracao;
                tituloMaisLonga = musica.titulo;
            }
        }
        return tituloMaisLonga;
    }
}
