package classe;

public class ProdutoComConstrutor {

    String nome = "";
    double preco = 0;

    ProdutoComConstrutor(String nome, double preco){

        this.nome = nome;

        if (preco < 0){
            this.preco = 0;
        } else {
            this.preco = preco;
        }
    }
}
