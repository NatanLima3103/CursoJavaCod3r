package ExerciciosFixacao.reforco1;

public class ArrayForEachNumerosExercicio {

    public static void main(String [] args) {

        int numPar = 0;

        int [] numeros = {1, 2, 4, 5, 7, 8};

        for (int numero : numeros){
            if (numero % 2 == 0){
                System.out.println(numero);

            }
        }
    }
}
