package stream.minmax.exercicioCinco;

public class Jogador {

    private String nome;
    private int rating;
    private int vitorias;
    private int partidas;

    public Jogador(String nome, int rating, int vitoria, int partidas){
        this.nome = nome;
        this.rating = rating;
        this.vitorias = vitoria;
        this.partidas = partidas;
    }

    public String getNome(){
        return nome;
    }

    public int getRating(){
        return rating;
    }

    public int getVitorias(){
        return vitorias;
    }

    public int getPartidas(){
        return partidas;
    }
}
