package stream.match.exercicioTres;

public class Sala {
    private String nome;
    private int co2;
    private double temperatura;
    private boolean janelaAberta;

    public Sala(String nome, int co2, double temperatura, boolean janelaAberta){
        this.nome = nome;
        this.co2 = co2;
        this.temperatura = temperatura;
        this.janelaAberta = janelaAberta;
    }

    public String getNome(){
        return nome;
    }

    public int getCo2(){
        return co2;
    }

    public double getTemperatura(){
        return temperatura;
    }

    public boolean isJanelaAberta(){
        return janelaAberta;
    }
}
