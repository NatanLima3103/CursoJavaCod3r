package ExerciciosFixacao.reforco1.reforcosGerais;

public class Produto {

    String nome;
    static int totalProdutos = 0;

    Produto(String nome){

        this.nome = nome;
        totalProdutos++;
    }
}
