package lambda.predicate.exercicioUm;

import java.util.function.Predicate;

public class Portaria {

    public static void main(String[] args) {

        Predicate<Integer> podeEntrar = idade -> idade >=18;

        System.out.println("Idade 20 -> " + podeEntrar.test(20));
        System.out.println("Idade 17 -> " + podeEntrar.test(17));
        System.out.println("Idade 18 -> " + podeEntrar.test(18));
    }
}
