package oo.interfaces.exercicioSete;

public class Vendedor implements Bonificavel{
    String nome;
    double vendaMes;

    public Vendedor(String nome, double vendaMes){
        this.nome = nome;
        this.vendaMes = vendaMes;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double calcularBonus() {
        return vendaMes * 5 / 100;
    }
}
