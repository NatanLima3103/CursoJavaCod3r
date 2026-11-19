package stream.map.exercicioCinco;

public class Recibo {

    private String cliente;
    private double total;

    public Recibo(String cliente, double total){
        this.cliente = cliente;
        this.total = total;
    }

    public String getCliente(){
        return cliente;
    }

    public double getTotal(){
        return total;
    }

    @Override
    public String toString() {
        return "Recibo de " + cliente + ": R$ " + total;
    }
}
