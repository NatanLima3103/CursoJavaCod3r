package oo.interfaces.exercicioUm;

public class Produto implements Taxavel{
    String nome;
    double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double calcularImposto() {
        return preco * 10 / 100;
    }
}
