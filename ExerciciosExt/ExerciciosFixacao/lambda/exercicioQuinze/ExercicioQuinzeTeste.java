package lambda.exercicioQuinze;

import java.util.ArrayList;

public class ExercicioQuinzeTeste {

    public static void executarChecklist(String titulo, ArrayList<Passo> passos){

        System.out.println(titulo);

        int contagemPasso = 0;

        for (Passo passo : passos){
            contagemPasso++;
            System.out.println("Passo: " + contagemPasso);
            passo.executar();
        }

        System.out.println("Checklist concluído! ");
    }

    public static void main(String[] args) {

        ArrayList<Passo> abertura = new ArrayList<>();
        abertura.add(() -> System.out.println(" Ligando as luzes"));
        abertura.add(() -> System.out.println("Abrindo o caixa"));
        abertura.add(() -> {
            System.out.println(" Conferindo...");
            System.out.println(" Estoque conferido");
        });

        ArrayList<Passo> fechamento = new ArrayList<>();
        fechamento.add(() -> System.out.println("Desligando as luzes"));
        fechamento.add(() -> {
            System.out.println(" Contando o caixa...");
            System.out.println(" Caixa fechado");
        });

        executarChecklist("--- Abertura da loja ---", abertura);
        executarChecklist("--- Fechamento da loja ---", fechamento);
    }
}
