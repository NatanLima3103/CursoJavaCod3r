package ExerciciosFixacao.reforco1;

public class Produto {

    String nome;
    static int totalProdutos = 0;

    Produto(String nome){

        this.nome = nome;
        totalProdutos++;
    }
}
