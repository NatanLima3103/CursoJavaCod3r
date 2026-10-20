package oo.interfaces.exercicioTres;

public class Sedex implements Frete{

    public Sedex (){

    }

    @Override
    public String getNome() {
        return "Sedex";
    }

    @Override
    public double calcular(double pesoKg) {
        return 20 + (5 * pesoKg);
    }
}
