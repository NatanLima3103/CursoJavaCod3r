package stream.map.exercicioDois;

public class Entrega {

    private String destino;
    private double pesoKg;

    Entrega(String destino, double pesoKg){
        this.destino = destino;
        this.pesoKg = pesoKg;
    }

    public String getDestino(){
        return destino;
    }

    public double getPesoKg(){
        return pesoKg;
    }
}
