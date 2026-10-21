package oo.interfaces.exercicioDez;

public class ExercicioDezTeste {
    public static void main(String[] args) {
        Central central = new Central();

        central.registrar(new Email());
        central.registrar(new Sms(30));
        central.registrar(new Push("Celular", true));
        central.registrar(new Push("Tablet", false));

        central.disparar("Pedido enviado");
        central.disparar("Seu pedido saiu para entrega e chega hoje");
    }
}
