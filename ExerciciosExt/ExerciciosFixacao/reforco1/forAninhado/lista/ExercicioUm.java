package reforco1.forAninhado.lista;

public class ExercicioUm {
    public static void main(String[] args) {
        String [] nomes = {"Processo A", "Processo B", "Processo C"};
        String [] etapas = {"Petição inicial", "Contestação", "Sentença"};

        for(int i = 0; i < nomes.length; i++){
            for(int j = 0; j < etapas.length; j++){
                System.out.println(nomes[i] + " - Etapa: " + etapas[j]);
            }
        }
    }
}
