package oo.composicao.exercicioSete;

public class ExercicioSeteTeste {

    public static void main(String[] args) {

        Carrinho carrinho = new Carrinho();

        Produto c1 = new Produto("Mouse", 50);
        Produto c2 = new Produto("Teclado", 120);
        Produto c3 = new Produto("Monitor", 800);
        Produto c4 = new Produto("Cabo", 15);

        carrinho.adicionarProduto(c1);
        carrinho.adicionarProduto(c2);
        carrinho.adicionarProduto(c3);

        System.out.println(carrinho.contarAcimaDe(90));

        System.out.println(carrinho.calcularTotal());

        carrinho.adicionarProduto(c4);

        System.out.println(carrinho.calcularTotal());
    }
}
