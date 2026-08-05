public class RelacionaisLogicosExercicio {

    //Crie duas variáveis booleanas: chegouCedo e fezTarefas. Usando
    // operadores lógicos, calcule e imprima: ganhouPremio (só se as
    // duas forem verdadeiras) e mereceAtencao (se pelo menos uma for
    // falsa).

    public static void main (String[] args) {

        boolean chegouCedo = true;
        boolean fezTarefas = false;

        boolean ganhouPremio = chegouCedo && fezTarefas;
        boolean mereceAtencao = !chegouCedo || !fezTarefas;

        System.out.println("Chegou cedo? " + chegouCedo);
        System.out.println("Fez a tarefa? " + fezTarefas);
        System.out.println("Ganhou Prêmio? " + ganhouPremio);
        System.out.println("Merece atenção? " + mereceAtencao);
    }
}
