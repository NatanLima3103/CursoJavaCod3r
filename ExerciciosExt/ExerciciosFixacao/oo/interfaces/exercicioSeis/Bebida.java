package oo.interfaces.exercicioSeis;

public class Bebida implements ItemCardapio{

    String nome;
    double precoBase;
    boolean gelada;

    public Bebida(String nome, double precoBase, boolean gelada){
        this.nome = nome;
        this.precoBase = precoBase;
        this.gelada = gelada;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        if (gelada){
            return precoBase + 2;
        }
        return precoBase;
    }
}
