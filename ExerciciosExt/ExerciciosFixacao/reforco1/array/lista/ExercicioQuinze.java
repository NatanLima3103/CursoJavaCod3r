package reforco1.array.lista;

public class ExercicioQuinze {

    public static void main(String[] args) {
        int [] numeros = {15, 18, 32, 55, 76, 79};
        int maiorNum = numeros[0];
        int menorNum = numeros[0];

        for (int i = 0; i < numeros.length; i++){

            if (numeros[i] < menorNum){

                menorNum = numeros[i];
            }
            if (numeros[i] > maiorNum){

                maiorNum = numeros[i];
            }
        }
        System.out.println(maiorNum - menorNum);
    }
}
