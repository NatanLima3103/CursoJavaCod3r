package poo.composicao.exercicioTres;

import java.util.ArrayList;

public class Pedido {
    int num;
    ArrayList<Produto>produtos;

    public Pedido(int num){

        this.num = num;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto p) {

        produtos.add(p);
    }

    public double calcularTotal(){

        double soma = 0;

        for(Produto p : produtos) {

            soma = soma + p.preco;

        }
        return soma;
    }

}
