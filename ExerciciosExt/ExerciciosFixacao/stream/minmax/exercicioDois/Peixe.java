package stream.minmax.exercicioDois;

public class Peixe {

    private String nome;
    private double pesoKg;
    private double precoKg;

    public Peixe(String nome, double pesoKg, double precoKg){
        this.nome = nome;
        this.pesoKg = pesoKg;
        this.precoKg = precoKg;
    }

    public String getNome(){
        return nome;
    }

    public double getPesoKg(){
        return pesoKg;
    }

    public double getPrecoKg(){
        return precoKg;
    }
}
