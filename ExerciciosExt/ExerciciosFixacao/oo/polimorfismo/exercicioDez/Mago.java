package oo.polimorfismo.exercicioDez;

public class Mago extends Personagem{
    private int mana;

    public Mago(String nome, int vida, int mana){
        super(nome, vida);
        this.mana = mana;
    }

    @Override
    public int calcularDano() {
        if (mana >= 20){
            mana -= 20;
            return super.calcularDano() + 30;
        }
        return super.calcularDano();
    }
}
