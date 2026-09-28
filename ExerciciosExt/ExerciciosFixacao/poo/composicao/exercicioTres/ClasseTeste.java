package poo.composicao.exercicioTres;

public class ClasseTeste {
    public static void main(String[] args) {

        Categoria categoria = new Categoria("Industrializados", 1);
        Produto produto1 = new Produto("Arroz", 4.99, categoria);
        Produto produto2 = new Produto("Feijão", 3.99, categoria);
        Produto produto3 = new Produto("Lentilha", 7.99, categoria);

        Pedido pedido = new Pedido(1001);

        pedido.adicionarProduto(produto1);
        pedido.adicionarProduto(produto2);
        pedido.adicionarProduto(produto3);

        System.out.println("Os itens presentes no pedido são: " + pedido.num);
        System.out.println("O total do pedido é: " + pedido.calcularTotal());
    }
}
