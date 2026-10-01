package oo.composicao.exercicioOito;

public class ExercicioOitoTeste {

    public static void main(String[] args) {

        Pedido p1 = new Pedido("Natan");
        Item i1 = new Item("Caneta", 3, 2.5);
        Item i2 = new Item("Caderno", 2, 15.0);
        Item i3 = new Item("Mochila", 1, 120.0);

        p1.adicionarItem(i1);
        p1.adicionarItem(i2);
        p1.adicionarItem(i3);

        System.out.println(p1.calcularTotal());
        System.out.println(p1.contarUnidades());

        Item i4 = new Item("Borracha", 4, 1.0);

        p1.adicionarItem(i4);

        System.out.println(p1.calcularTotal());
        System.out.println(p1.contarUnidades());
    }
}
