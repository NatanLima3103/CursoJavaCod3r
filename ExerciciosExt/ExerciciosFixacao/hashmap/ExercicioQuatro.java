package hashmap;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        HashMap<Integer, String> pares = new HashMap<>();

        pares.put(1, "Controle");
        pares.put(2, "Monitor");
        pares.put(3, "Teclado");
        pares.put(4, "Mouse");

        System.out.println("Informe o ID do produto, que deseja excluir: ");
        int id = entrada.nextInt();

        System.out.println("O produto " + pares.remove(id) + " (id " + id + ") foi removido com sucesso");
        System.out.println("");
        System.out.println("Restaram: " + pares);
    }
}
