package oo.polimorfismo.exercicioDez;

public class Personagem {
    private String nome;
    private int vida;

    public Personagem(String nome, int vida){
        this.nome = nome;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int calcularDano(){
        return 10;
    }

    public void receberDado(int dano){
        vida -= dano;
        if (vida < 0){
            vida = 0;
        }
    }

    public boolean estaVivo(){
        if (vida > 0){
            return true;
        }
        return false;
    }
}
