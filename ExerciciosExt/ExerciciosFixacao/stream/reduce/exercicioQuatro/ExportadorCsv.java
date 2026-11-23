package stream.reduce.exercicioQuatro;

import java.util.ArrayList;
import java.util.List;

public class ExportadorCsv {

    public static void main(String[] args) {
        List<String> colunas = new ArrayList<>();

        colunas.add("nome");
        colunas.add("email");
        colunas.add("telefone");

        System.out.println("=== EXPORTACAO CSV ===");

        String comSombra = colunas.stream()
                .reduce("", (a, b) -> a + b + ";");

        System.out.println("Com separador sobrando: " + comSombra);

        String cabecalho = colunas.stream()
                .reduce("", (a, b) -> a.isEmpty() ? b : a + ";" + b);

        System.out.println("Cabecalho correto: " + cabecalho);

        int totalCaracteres = colunas.stream()
                .map(c -> c.length())
                .reduce(0, (a, b) -> a + b);

        System.out.println("Total de caracteres: " + totalCaracteres);
    }
}
