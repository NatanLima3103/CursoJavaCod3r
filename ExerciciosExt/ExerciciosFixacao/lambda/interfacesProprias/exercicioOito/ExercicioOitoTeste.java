package lambda.interfacesProprias.exercicioOito;

public class ExercicioOitoTeste {

    static void executarTarefa(String nome, Tarefa tarefa){

        System.out.println(">>> Iniciando: " + nome);
        tarefa.executar();
        System.out.println(">>> Concluído: " + nome);
    }

    public static void main(String[] args) {
        executarTarefa("Backup", () -> {
            System.out.println("Copiando arquivos...");
            for (int i = 1; i <= 3; i++){
                System.out.println(" Parte " + i + "/" + "3 " + " copiada");
            }
        });
        executarTarefa("Limpeza de cache", () -> System.out.println("Cache limpo!"));
    }
}
