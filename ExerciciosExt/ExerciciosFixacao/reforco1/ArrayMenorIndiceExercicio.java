package ExerciciosFixacao.reforco1;

public class ArrayMenorIndiceExercicio {

    public static void main(String[] args){

        int [] numeros  = {-5, 12, 3, 45, 8, 30, 25};

        int menorNumero = numeros[0];
        int indiceDoMenor = 0;

        for (int i = 1; i < numeros.length; i++){

            if(numeros[i] < menorNumero){
                menorNumero = numeros[i];
                indiceDoMenor = i;

            }
        }

        System.out.println(menorNumero);
        System.out.println(indiceDoMenor);
    }
}
