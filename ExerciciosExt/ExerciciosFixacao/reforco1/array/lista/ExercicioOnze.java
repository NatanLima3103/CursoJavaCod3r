package reforco1.array.lista;

public class ExercicioOnze {

    public static void main(String[] args) {

        double [] numeros = {64.3, 3.4, 28.2, 23.1, 73.9, 67.9};
        int contador = 0;

        for (int i = 0; i < numeros.length; i++){

            if(numeros[i] > 50){

                contador++;
            }
        }
        System.out.println(contador + " Valores são maiores que 50.");
    }
}
