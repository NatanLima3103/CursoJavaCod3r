package poo.composicao.exercicioTres;

public class Produto {

    String descricao;
    double preco;
    Categoria categoria;

    public Produto(String descricao, double preco, Categoria categoria){

        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }
}
