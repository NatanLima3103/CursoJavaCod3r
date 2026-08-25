package ExerciciosFixacao.reforco1;

public class ArrayForEachMultiplosExercicio {

    public static void main(String[] args) {

        int [] numeros = { 5, 10, 15, 20, 25, 27, 30};

        for(int numero : numeros){
            if (numero % 5 == 0){

                System.out.println(numero);
            }
        }
    }
}
