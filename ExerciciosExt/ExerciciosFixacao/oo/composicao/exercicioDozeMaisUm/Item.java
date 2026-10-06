package oo.composicao.exercicioDozeMaisUm;

public class Item {

    String nome;
    int quantidade;
    double preco;

    Item(String nome, int quantidade, double preco){

        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    double subtotal(){

        return quantidade * preco;
    }
}
