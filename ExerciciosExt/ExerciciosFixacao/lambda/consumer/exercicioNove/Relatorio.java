package lambda.consumer.exercicioNove;

public class Relatorio {

    private int reposicoes;

    public Relatorio(){
        reposicoes = 0;
    }

    public void registrarReposicoes(){
        reposicoes++;
    }

    public int getReposicoes(){
        return reposicoes;
    }
}
