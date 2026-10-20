package oo.interfaces.exercicioTres;

public class Pac implements Frete{

    public Pac(){

    }

    @Override
    public String getNome() {
        return "Pac";
    }

    @Override
    public double calcular(double pesoKg) {
        return 10 + (3 * pesoKg);
    }
}
