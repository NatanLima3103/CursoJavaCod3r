package oo.composicao.exercicioDozeMaisUm;

public class ExercicioDozeMaisUmTeste {

    public static void main(String[] args) {

        Endereco e1 = new Endereco("Rua José Lins do Rego", "Curitiba");
        Cliente c1 = new Cliente("Natan", e1);
        Item i1 = new Item("Notebook", 1, 2000);
        Item i2 = new Item("Monitor", 2, 1000);
        Item i3 = new Item("Teclado", 1, 280);
        Item i4 = new Item("Mouse", 1, 110);

        Pedido p1 = new Pedido(c1);
        Pedido p2 = new Pedido(c1);

        p1.adicionarItem(i1);
        p1.adicionarItem(i2);
        p1.adicionarItem(i3);

        System.out.println(p1.descrever());
        System.out.println(p1.calcularTotal());
        System.out.println(p1.entregaGratis());

        p2.adicionarItem(i4);

        System.out.println(p2.descrever());
        System.out.println(p2.calcularTotal());
        System.out.println(p2.entregaGratis());

        e1.cidade = "São José dos Pinhais";

        System.out.println(p1.descrever());
        System.out.println(p2.descrever());
    }
}
