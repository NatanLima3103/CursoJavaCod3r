package reforco1.array.lista;

public class ExercicioNove {

    public static void main(String[] args) {

        int [] numeros = {37, 53, 64, 75, 98, 99};

        boolean todosPositivos = true;

        for (int i = 0; i < numeros.length; i++){

            if( numeros[i] < 0){

                todosPositivos = false;
            }
        }
        if (todosPositivos){

            System.out.println("Somente números positivos");
        } else {
            System.out.println("Possuem números negativos");
        }
    }
}
