package oo.polimorfismo.exercicioDez;

import java.net.CacheRequest;

public class ExercicioDezTeste {
    public static void main(String[] args) {
        Arena a1 = new Arena();

        Guerreiro thor = new Guerreiro("Thor", 100);
        Mago merlin = new Mago("Merlin", 80, 40);
        Arqueiro legolas = new Arqueiro("Legolas", 90);

        a1.adicionarPersonagem(thor);
        a1.adicionarPersonagem(merlin);
        a1.adicionarPersonagem(legolas);

        a1.atacar(merlin, thor);
        a1.atacar(merlin, thor);
        a1.atacar(merlin, thor);
        a1.atacar(legolas, thor);
        a1.atacar(thor, legolas);
        a1.atacar(legolas, merlin);

        System.out.println(thor.getNome() + ": vida " + thor.getVida());
        System.out.println(merlin.getNome() + ": vida " + merlin.getVida());
        System.out.println(legolas.getNome() + ": vida " + legolas.getVida());

        System.out.println("Vivos: " + a1.contarVivos());

        Personagem maisVida = a1.encontrarComMaisVida();
        System.out.println("Personagem com mais vida: " + maisVida.getNome());
    }
}
