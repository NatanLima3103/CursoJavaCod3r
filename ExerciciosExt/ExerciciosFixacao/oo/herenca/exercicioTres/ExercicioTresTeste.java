package oo.herenca.exercicioTres;

public class ExercicioTresTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Caneta", 10.0);
        Produto p2 = new ProdutoPromocional("Caderno", 50.0, 20.0);

        System.out.println(p1.calcularPreco());
        System.out.println(p1.descricao());

        System.out.println(p2.calcularPreco());
        System.out.println(p2.descricao());
    }
}
