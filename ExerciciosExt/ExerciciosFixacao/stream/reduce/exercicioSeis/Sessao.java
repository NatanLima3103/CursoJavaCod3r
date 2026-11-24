package stream.reduce.exercicioSeis;

public class Sessao {

    private String filme;
    private int ingressos;
    private double valorIngresso;
    private boolean dublado;

    public Sessao(String filme, int ingressos, double valorIngresso, boolean dublado){
        this.filme = filme;
        this.ingressos = ingressos;
        this.valorIngresso = valorIngresso;
        this.dublado = dublado;
    }

    public String getFilme(){
        return filme;
    }

    public int getIngressos(){
        return ingressos;
    }

    public double getValorIngresso(){
        return valorIngresso;
    }

    public boolean isDublado(){
        return dublado;
    }
}
