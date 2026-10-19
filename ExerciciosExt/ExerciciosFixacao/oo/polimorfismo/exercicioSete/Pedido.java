package oo.polimorfismo.exercicioSete;

public class Pedido {
    private String cliente;
    private double valor;
    private Entrega entrega;

    public Pedido(String cliente, double valor, Entrega entrega){
        this.cliente = cliente;
        this.valor = valor;
        this.entrega = entrega;
    }

    public String getCliente() {
        return cliente;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    public double calcularTotal(){
        return valor + entrega.calcularFrete(valor);
    }
}
