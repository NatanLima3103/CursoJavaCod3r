package reforco1.array.lista;

public class ExercicioSete {

    public static void main(String[] args){

        int [] numeros = {82, 15, 4, 95, 36, 32};
        int menorNum = numeros[0];

        for(int i = 1; i < numeros.length; i++){

            if(numeros[i] < menorNum){
                menorNum = numeros[i];
            }
        }
        System.out.println(menorNum);
    }
}
