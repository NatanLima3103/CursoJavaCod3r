package ExerciciosFixacao.reforco1.reforcosGerais;

public class ArrayMaiorIndiceExercicio {

    public static void main(String[] args) {

        int [] numeros = {5, 12, 3, 45, 8, 30, 25, 31};

        int maiorNumero = 0;
        int indiceDoMaior = 0;

        for (int i = 0; i < numeros.length; i++){

            if(numeros[i] > maiorNumero){
                maiorNumero = numeros[i];
                indiceDoMaior = i;
            }
        }

        System.out.println("O maior valor está na posição: " + indiceDoMaior);
        System.out.println("O maior valor é: " + maiorNumero);
    }
}
