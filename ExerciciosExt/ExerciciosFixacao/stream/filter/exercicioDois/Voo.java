package stream.filter.exercicioDois;

public class Voo {

    private String destino;
    private int atrasosMinutos;
    private int assentosLivres;

    public Voo(String destino, int atrasosMinutos, int assentosLivres){
        this.destino = destino;
        this.atrasosMinutos = atrasosMinutos;
        this.assentosLivres = assentosLivres;
    }

    public String getDestino(){
        return destino;
    }

    public int getAtrasosMinutos(){
        return atrasosMinutos;
    }

    public int getAssentosLivres(){
        return assentosLivres;
    }
}
