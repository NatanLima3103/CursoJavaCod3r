package oo.interfaces.exercicioSeis;

public class Sobremesa implements ItemCardapio{

    String nome;
    double precoPorcao;
    int porcoes;

    public Sobremesa(String nome, double precoPorcao, int porcoes){
        this.nome = nome;
        this.precoPorcao = precoPorcao;
        this.porcoes = porcoes;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return precoPorcao * porcoes;
    }
}
