package stream.match.exercicioDois;

public class Extintor {

    private String local;
    private double cargaKg;
    private boolean lacrado;

    public Extintor(String local, double cargaKg, boolean lacrado){
        this.local = local;
        this.cargaKg = cargaKg;
        this.lacrado = lacrado;
    }

    public String getLocal(){
        return local;
    }

    public double getCargaKg(){
        return cargaKg;
    }

    public boolean isLacrado(){
        return lacrado;
    }
}
