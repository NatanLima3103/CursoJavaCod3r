package oo.composicao.exercicioCinco;

public class ExercicioCincoTeste {

    public static void main(String[] args) {

        Pagamento p1 = new Pagamento(100.0);
        Pedido pedidoUm = new Pedido("Teclado", p1);

        System.out.println(pedidoUm.status());
        System.out.println(pedidoUm.pagar(50.0));
        System.out.println(pedidoUm.status());
        System.out.println(pedidoUm.pagar(100.0));
        System.out.println(pedidoUm.status());
        System.out.println(p1.pago);
    }
}
