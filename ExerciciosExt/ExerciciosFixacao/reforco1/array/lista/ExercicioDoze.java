package reforco1.array.lista;

public class ExercicioDoze {

    public static void main(String[] args) {

        int [] numeros = {64, 61, 24, 68, 15, 21, 16};
        int somaPar = 0;
        int somaImpar = 0;

        for (int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 == 0){

                somaPar = somaPar + numeros[i];
            } else{

                somaImpar = somaImpar + numeros[i];
            }
        }
        System.out.println("Soma dos números pares: " + somaPar);
        System.out.println("Soma dos números ímpares: " + somaImpar);
    }
}
