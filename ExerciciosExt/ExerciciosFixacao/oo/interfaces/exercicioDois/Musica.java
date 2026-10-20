package oo.interfaces.exercicioDois;

public class Musica implements Reproduzivel{
    String titulo;
    String artista;
    int duracaoMinutos;

    public Musica(String titulo, String artista, int duracaoMinutos){
        this.titulo = titulo;
        this.artista = artista;
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public String reproduzir() {
        return "Tocando música: " + titulo + " - " + artista;
    }

    @Override
    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }
}
