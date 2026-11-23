package stream.filter.exercicioSete;

public class Muda {

    private String nome;
    private int alturaCm;
    private boolean saudavel;
    private double preco;

    public Muda(String nome, int alturaCm, boolean saudavel, double preco){
        this.nome = nome;
        this.alturaCm = alturaCm;
        this.saudavel = saudavel;
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }

    public int getAlturaCm(){
        return alturaCm;
    }

    public boolean isSaudavel(){
        return saudavel;
    }

    public double getPreco(){
        return preco;
    }
}
