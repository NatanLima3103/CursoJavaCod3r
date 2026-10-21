package oo.interfaces.exercicioSete;

public class Estagiario implements Bonificavel{
    String nome;

    public Estagiario(String nome){
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double calcularBonus() {
        return 200.0;
    }
}
