package arraylist;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<String> tarefas = new ArrayList<>();

        tarefas.add("1 - Passar pano");
        tarefas.add("2 - Varrer chão");
        tarefas.add("3 - Lavar louça");
        tarefas.add("4 - Limpar calçada");
        tarefas.add("5 - Cozinhar");
        tarefas.add("6 - Passar aspirador");

        System.out.println("Qual a posição deseja verificar?");
        int posicao = entrada.nextInt();

        entrada.nextLine();

        System.out.println("Informe uma nova tarefa: ");
        String novaTarefa = entrada.nextLine();

        tarefas.set(posicao, novaTarefa);

        System.out.println(tarefas);
    }
}
