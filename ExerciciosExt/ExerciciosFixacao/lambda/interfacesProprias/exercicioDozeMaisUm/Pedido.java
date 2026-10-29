package lambda.interfacesProprias.exercicioDozeMaisUm;

public class Pedido {

    private String cliente;
    private double distanciaKm;
    private double pesoKg;

    public Pedido(String cliente, double distanciaKm, double pesoKg){
        this.cliente = cliente;
        this.distanciaKm = distanciaKm;
        this.pesoKg = pesoKg;
    }

    public String getCliente() {
        return cliente;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public double getPesoKg() {
        return pesoKg;
    }
}
