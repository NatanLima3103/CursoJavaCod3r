package ExerciciosFixacao.reforco1.reforcosGerais;

public class AnimalTeste {

    public static void main(String[] args){

        Animal a1 = new Animal("Pupinelson", "Gato");
        Animal a2 = new Animal("Belinha", "Cachorro");

        System.out.println("Nome primeiro animal: " + a1.nome);
        System.out.println("Espécie primeiro animal: " + a1.especie);
        System.out.println("Nome segundo animal: " + a2.nome);
        System.out.println("Espécie segundo animal: " + a2.especie);
    }
}
