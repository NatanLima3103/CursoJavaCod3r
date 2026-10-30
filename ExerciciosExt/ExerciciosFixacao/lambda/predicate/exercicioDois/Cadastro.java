package lambda.predicate.exercicioDois;

import java.util.function.Predicate;

public class Cadastro {

    public static void main(String[] args) {

        Predicate<String> nomePreenchido = nome -> !nome.isEmpty();
        Predicate<String> senhaValida = senha -> senha.length() >= 8;

        System.out.println("Nome válido: " + nomePreenchido.test("Natan"));
        System.out.println("Nome válido: " + nomePreenchido.test(""));
        System.out.println("Senha válida: " + senhaValida.test("abc123"));
        System.out.println("Senha válida: " + senhaValida.test("12345678"));
        System.out.println("Senha válida: " + senhaValida.test("senhaForte2026"));
    }
}
