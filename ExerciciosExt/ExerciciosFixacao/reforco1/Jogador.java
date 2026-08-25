package ExerciciosFixacao.reforco1;

public class Jogador {

    String nome;
    int pontuacao;
    static int maiorPontuacao = 0;

    Jogador(String nome, int pontuacao){

        this.nome = nome;
        this.pontuacao = pontuacao;

        if(pontuacao > maiorPontuacao){

            maiorPontuacao = pontuacao;
        }
    }
}
