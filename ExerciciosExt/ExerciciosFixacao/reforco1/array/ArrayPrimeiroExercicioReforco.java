package ExerciciosFixacao.reforco1.array;

public class ArrayPrimeiroExercicioReforco {

    public static void main(String[] args) {

        int [] numeros = {1, 2, 3, 4, 5, 6};

        int soma = 0;

        for (int i = 0; i < numeros.length; i++){

            soma = numeros[i] + soma;
        }

        System.out.println(soma);
    }
}
