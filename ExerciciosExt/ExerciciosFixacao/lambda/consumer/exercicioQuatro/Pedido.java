package lambda.consumer.exercicioQuatro;

public class Pedido {

    private String cliente;
    private double valor;
    private String status;

    public Pedido(String cliente, double valor){
        this.cliente = cliente;
        this.valor = valor;
        status = "PENDENTE";
    }

    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
