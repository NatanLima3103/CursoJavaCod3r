package oo.enuns.exercicioUmAoCinco;

public class mainQuatro {

    public static void main(String[] args) {

        Loja l1 = new Loja("Compra certa");
        Pedido p1 = new Pedido(100);
        Pedido p2 = new Pedido(101);
        Pedido p3 = new Pedido(102);
        Pedido p4 = new Pedido(103);
        Pedido p5 = new Pedido(104);

        l1.adicionarPedido(p1);
        l1.adicionarPedido(p2);
        l1.adicionarPedido(p3);
        l1.adicionarPedido(p4);
        l1.adicionarPedido(p5);

        p2.avancar();

        p3.avancar();
        p3.avancar();

        p4.avancar();
        p4.avancar();
        p4.avancar();

        p5.avancar();
        p5.avancar();
        p5.avancar();
        p5.avancar();

        for(StatusPedido status : StatusPedido.values()){

            System.out.println(status + ": " + l1.contarPorStatus(status));
        }

        System.out.println(l1.totalCancelaveis());

        StatusPedido buscando = StatusPedido.valueOf("ENVIADO");
        System.out.println(l1.contarPorStatus(buscando));
    }
}
