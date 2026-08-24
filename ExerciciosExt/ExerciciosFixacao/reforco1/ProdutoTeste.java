package ExerciciosFixacao.reforco1;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Celular");
        Produto p2 = new Produto("Capinha");
        Produto p3 = new Produto("Película");
        Produto p4 = new Produto("Kit limpeza");

        System.out.println("Nome do produto: " + p1.nome);
        System.out.println("Nome do produto: " + p2.nome);
        System.out.println("Nome do produto: " + p3.nome);
        System.out.println("Nome do produto: " + p4.nome);

        System.out.println("Quantidade total de produtos: " + Produto.totalProdutos);
    }
}
