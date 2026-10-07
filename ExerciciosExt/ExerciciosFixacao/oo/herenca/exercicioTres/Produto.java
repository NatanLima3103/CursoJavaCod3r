package oo.herenca.exercicioTres;

public class Produto {

    String nome;
    double preco;

    Produto(String nome, double preco){

        this.nome = nome;
        this.preco = preco;
    }

    double calcularPreco(){

        return preco;
    }

    String descricao(){

        return "Produto: " + nome;
    }
}
