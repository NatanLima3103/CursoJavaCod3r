package ExerciciosFixacao.reforco1;

public class PedidoTeste {

    public static void main(String[] args) {

        Pedido p1 = new Pedido("Compra de celular", 1500);
        Pedido p2 = new Pedido("Compra de capinha", 10.50);
        Pedido p3 = new Pedido("Compra de película", 15.90);

        System.out.println("Descrição primeira compra: " + p1.descricao);
        System.out.println("Valor primeira compra: " + p1.valor);

        System.out.println("Descrição segunda compra: " + p2.descricao);
        System.out.println("Valor segunda compra: " + p2.valor);

        System.out.println("Descrição terceira compra: " + p3.descricao);
        System.out.println("Valor terceira compra: " + p3.valor);

        System.out.println("Soma total das compras: " + Pedido.valorTotalPedidos);
    }
}
