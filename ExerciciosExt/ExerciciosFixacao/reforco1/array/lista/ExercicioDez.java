package reforco1.array.lista;

public class ExercicioDez {

    public static void main(String[] args) {

        int [] numeros = {80, 77, 70, 76, 87, 11, 59};
        int maiorNum = numeros[0];
        int posicaoMaior = 0;

        for (int i = 1; i < numeros.length; i++){

            if (maiorNum < numeros[i]){

                maiorNum = numeros[i];
                posicaoMaior = i;
            }
        }
        System.out.println("O maior número é: " + maiorNum + ", está na posição: " + posicaoMaior);
    }
}
