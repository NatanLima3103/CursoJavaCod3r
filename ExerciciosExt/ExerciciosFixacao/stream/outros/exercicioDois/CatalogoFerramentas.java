package stream.outros.exercicioDois;

import java.util.ArrayList;
import java.util.List;

public class CatalogoFerramentas {

    public static void imprimirPagina(List<String> itens, int pagina, int tamanho){
        itens.stream()
                .skip((pagina - 1) * tamanho)
                .limit(tamanho)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<String> ferramentas = new ArrayList<>();

        ferramentas.add("Martelo");
        ferramentas.add("Alicate");
        ferramentas.add("Serrote");
        ferramentas.add("Furadeira");
        ferramentas.add("Trena");
        ferramentas.add("Nivel");
        ferramentas.add("Broca");
        ferramentas.add("Lixa");

        System.out.println("=== PAGINA 1 ===");

        ferramentas.stream()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("=== PAGINA 2 ===");

        ferramentas.stream()
                .skip(3)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("=== ORDEM INVERTIDA ===");
        long invertida = ferramentas.stream()
                .limit(3)
                .skip(3)
                .count();

        System.out.println("Itens na cadeia invertida: " + invertida);

        System.out.println("=== PAGINA 3 (METODO) ===");
        imprimirPagina(ferramentas, 3, 3);
    }
}