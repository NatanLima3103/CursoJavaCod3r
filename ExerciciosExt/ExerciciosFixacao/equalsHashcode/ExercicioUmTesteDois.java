package equalsHashcode;

import java.util.HashSet;

public class ExercicioUmTesteDois {
    public static void main(String[] args) {
        HashSet<ExercicioUm> produtos = new HashSet<>();

        produtos.add(new ExercicioUm("Mouse", 100));
        produtos.add(new ExercicioUm("Mouse", 100));

        System.out.println(produtos.size());
    }
}
