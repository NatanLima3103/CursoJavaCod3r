package oo.polimorfismo.exercicioDez;

public class Guerreiro extends Personagem{
    public Guerreiro(String nome, int vida){
        super(nome, vida);
    }

    @Override
    public int calcularDano() {
        return super.calcularDano() + 15;
    }
}
