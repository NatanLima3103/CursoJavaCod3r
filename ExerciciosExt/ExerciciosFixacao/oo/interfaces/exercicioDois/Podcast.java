package oo.interfaces.exercicioDois;

public class Podcast implements Reproduzivel{
    String nome;
    int episodio;
    int duracaoMinutos;

    public Podcast(String nome, int episodio, int duracaoMinutos){
        this.nome = nome;
        this.episodio = episodio;
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public String reproduzir() {
        return "Reproduzindo podcast: " + nome + " (ep. " + episodio + ")";
    }

    @Override
    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }
}
