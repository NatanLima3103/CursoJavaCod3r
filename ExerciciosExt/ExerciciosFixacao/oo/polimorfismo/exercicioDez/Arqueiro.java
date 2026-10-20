package oo.polimorfismo.exercicioDez;

public class Arqueiro extends Personagem{
    public Arqueiro(String nome, int vida){
        super(nome, vida);
    }

    @Override
    public int calcularDano() {
        return super.calcularDano() + 8;
    }
}
