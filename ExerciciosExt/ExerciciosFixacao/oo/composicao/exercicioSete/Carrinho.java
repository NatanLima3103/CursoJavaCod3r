package oo.composicao.exercicioSete;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    List<Produto> produtos = new ArrayList<>();

    Carrinho(){

    }

    void adicionarProduto(Produto produto){

        produtos.add(produto);
    }

    double calcularTotal(){
        double somaPreco = 0;
        for(Produto produto : produtos){
            somaPreco = somaPreco + produto.preco;
        }
        return somaPreco;
    }

    int contarAcimaDe(double limite){
        int quantidade = 0;
        for(Produto produto : produtos){
            if(produto.preco > limite){
                quantidade++;
            }
        }
        return quantidade;
    }
}