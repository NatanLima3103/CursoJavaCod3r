package oo.interfaces.exercicioTres;

public class Transportadora implements Frete{
    private String nome;

    public Transportadora(String nome){
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double calcular(double pesoKg) {
        return 15 + (2.5 * pesoKg);
    }
}
