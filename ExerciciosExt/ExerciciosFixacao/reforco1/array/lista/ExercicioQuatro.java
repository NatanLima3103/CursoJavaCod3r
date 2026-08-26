package ExerciciosFixacao.reforco1.array.lista;

public class ExercicioQuatro {

    public static void main(String[] args){

        int [] numeros = {72, 92, 85, 44, 51, 71, 39};
        int somaPar = 0;

        for (int i = 0; i < numeros.length; i++){

            if (numeros[i] % 2 == 0){

                somaPar = numeros[i] + somaPar;
            }
        }
        System.out.println(somaPar);
    }
}
