package ExerciciosFixacao.reforco1.array.lista;

public class ExercicioDois {

    public static void main(String[] args) {

        int [] numeros = {-60, 61, -71, 61, 36, -53, -66, 78};

        int numNegativo = 0;

        for (int i = 0; i < numeros.length; i++){

            if(numeros[i] < 0){
                numNegativo++;
            }
        }
        System.out.println(numNegativo + " números são negativos!");
    }
}
