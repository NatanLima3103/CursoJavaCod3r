package lambda.predicate.exercicioNove;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ValidadorSenha {

    static boolean validar(String senha, List<Predicate<String>> regras){
        for (Predicate<String> regra : regras){
            if (!regra.test(senha)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Predicate<String>> regras = new ArrayList<>();
        regras.add(s -> s.length() >= 8);
        regras.add(s -> !s.contains(" "));
        regras.add(s -> s.contains("#"));
        regras.add(s -> s.length() <= 15);

        System.out.println("Senha \"abc\" -> " + validar("abc", regras));
        System.out.println("Senha \"senha forte 123\" -> " + validar("senha forte 123", regras));
        System.out.println("Senha \"SenhaForte#2026\" -> " + validar("SenhaForte#2026", regras));
        System.out.println("Senha \"senhaforte2026\" -> " + validar("senhaforte2026", regras));
        System.out.println("Senha \"SenhaForte#2026abc\" -> " + validar("SenhaForte#2026abc", regras));
    }
}
