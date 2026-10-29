package lambda.interfacesProprias.exercicioQuatorze;

public class ExercicioQuatorzaTeste {

    public static void repetir(String nome, int vezes, Rotina rotina){

        System.out.println("=== " + nome + " (" + vezes + " vezes) ===");
        for (int i = 1; i <= vezes; i++){
            System.out.println("Rodada " + i );
            rotina.executar();
        }
    }

    public static void main(String[] args) {
        repetir("Irrigação", 3, () -> System.out.println("Irrigando as plantes..."));

        repetir("Ventilação", 2, () -> {
            System.out.println("Ligando ventilador");
            System.out.println("Desligando ventilador");
        });

        Rotina alarme = () -> System.out.println(" BIP!");
        repetir("Alarme", 2, alarme);
    }
}
