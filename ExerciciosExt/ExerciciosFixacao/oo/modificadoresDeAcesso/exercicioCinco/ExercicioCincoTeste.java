package oo.modificadoresDeAcesso.exercicioCinco;

public class ExercicioCincoTeste {
    public static void main(String[] args) {
        Caixa caixa = new Caixa();
        Pedido p1 = new Pedido("Natan", 120.0);
        Pedido p2 = new Pedido("Lima", 80.0);
        Pedido p3 = new Pedido("Aline", 50.0);

        caixa.registrar(p1);
        caixa.registrar(p2);
        caixa.registrar(p3);

        p1.pagar();
        p3.pagar();
        p1.pagar();

        caixa.listar();

        caixa.fecharCaixa();

//        p2.pago = true;
//
//        caixa.recebido = 9999;
    }
}
