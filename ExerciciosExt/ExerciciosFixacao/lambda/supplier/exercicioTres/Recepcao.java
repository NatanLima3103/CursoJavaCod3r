package lambda.supplier.exercicioTres;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Recepcao {

    public static String nomeOuPadrao(String nome, Supplier<String> padrao){
        if (nome.isEmpty()){
            return padrao.get();
        }
        return nome;
    }

    public static void main(String[] args) {
        Supplier<String> nomePadrao = () -> "Sem nome";

        List<Pet> pets = new ArrayList<>();

        pets.add(new Pet("Rex", "Cachorro"));
        pets.add(new Pet("", "Gato"));
        pets.add(new Pet("Mel", "Coelho"));
        pets.add(new Pet("", "Papagaio"));

        for (Pet pet : pets){
            System.out.println(nomeOuPadrao(pet.getNome(), nomePadrao) + " (" + pet.getEspecie() + ")");
        }

        System.out.println(nomeOuPadrao("", () -> "Pet sem identificação"));
    }
}
