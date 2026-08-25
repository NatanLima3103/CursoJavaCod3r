package ExerciciosFixacao.reforco1;

public class ArrayForEachContadorExercicio {

    public static void main(String [] args) {

        int [] numeros = { 19, 52, 31, 5, 29, 87, 90, 63};

        int contador = 0;

        for (int numero : numeros){

            if (numero > 10){
                contador++;
                System.out.println(numero);
            }
        }

        System.out.println(contador + " números são maiores que 10.");
    }
}
