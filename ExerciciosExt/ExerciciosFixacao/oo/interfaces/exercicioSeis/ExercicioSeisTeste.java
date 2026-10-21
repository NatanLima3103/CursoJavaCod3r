package oo.interfaces.exercicioSeis;

public class ExercicioSeisTeste {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("Natan");

        pedido.adicionar(new Prato("Feijoada", 38.0));
        pedido.adicionar(new Bebida("Suco", 8.0, true));
        pedido.adicionar(new Sobremesa("Pudim", 7.5, 2));
        pedido.adicionar(new Bebida("Água", 4.0, false));

        pedido.imprimirResumo();
    }
}
