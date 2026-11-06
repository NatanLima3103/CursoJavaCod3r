package lambda.function.exercicioSete;

public class Encomenda {

    private String nome;
    private double pesoKg;

    public Encomenda(String nome, double pesoKg){
        this.nome = nome;
        this.pesoKg = pesoKg;
    }

    public String getNome(){
        return nome;
    }

    public double getPesoKg(){
        return pesoKg;
    }
}