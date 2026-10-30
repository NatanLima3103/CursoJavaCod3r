package lambda.predicate.exercicioQuatro;

import java.util.function.Predicate;

public class Transportadora {

    public static void avaliar(String regra, int pesoKg, Predicate<Integer> condicao){
        System.out.println(regra + " (" + pesoKg + "kg) -> " + condicao.test(pesoKg));
    }

    public static void main(String[] args) {
        avaliar("Aceita pacote", 25, peso -> peso <= 30);
        avaliar("Aceita pacote", 45, peso -> peso <= 30);
        avaliar("Frete grátis", 4, peso -> peso <= 4);
        avaliar("Pacote pesado", 40, peso -> peso > 30);
    }
}
