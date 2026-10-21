package oo.interfaces.exercicioSeis;

public class Prato implements ItemCardapio{
    String nome;
    double preco;

    public Prato(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }
}
