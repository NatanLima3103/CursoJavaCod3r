package oo.enuns.exercicioUmAoCinco;

public class PedidoTeste {

    public static void main(String[] args) {

        Pedido p1 = new Pedido(101);

        System.out.println(p1.descrever());
        System.out.println(p1.podeCancelar());

        p1.avancar();
        System.out.println(p1.descrever());
        System.out.println(p1.podeCancelar());

        p1.avancar();
        System.out.println(p1.descrever());
        System.out.println(p1.podeCancelar());

        p1.avancar();
        System.out.println(p1.descrever());
        System.out.println(p1.podeCancelar());

        p1.avancar();
        System.out.println(p1.descrever());
        System.out.println(p1.podeCancelar());
    }
}
