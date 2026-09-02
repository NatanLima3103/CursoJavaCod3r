package ExerciciosFixacao.reforco1.reforcosGerais;

public class ArrayContadorExercicio {

    public static void main(String[] args){

        int[] numeros = { 1, 3 , 5, 7, 9, 2, 4, 6, 8, 10};

        int numPar = 0;
        int numImpar = 0;

        for(int i = 0; i < numeros.length; i++){

            if (numeros[i] % 2 ==0){
                numPar++;
            } else {
                numImpar++;
            }
        }

        System.out.println("Quantidade de números pares: " + numPar);
        System.out.println("Quantidade de números ímpares: " + numImpar);
    }
}
