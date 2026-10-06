package oo.enuns.exercicioUmAoCinco;

public class Pedido {

    int numero;
    StatusPedido status;

    Pedido(int numero){

        this.numero = numero;
        this.status = StatusPedido.PENDENTE;
    }

    boolean podeCancelar() {
        boolean cancelamento = false;
        if(status == StatusPedido.PENDENTE || status == StatusPedido.PAGO){
            cancelamento = true;
        }
        return cancelamento;
    }

    void avancar(){
        if(status == StatusPedido.PENDENTE){
            status = StatusPedido.PAGO;
        } else if (status == StatusPedido.PAGO) {
            status = StatusPedido.ENVIADO;
        } else if (status == StatusPedido.ENVIADO) {
            status = StatusPedido.ENTREGUE;
        }
    }

    String descrever() {

        return "Pedido " + numero + ": " + status;
    }
}
