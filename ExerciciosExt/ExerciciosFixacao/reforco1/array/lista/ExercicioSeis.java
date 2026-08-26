package ExerciciosFixacao.reforco1.array.lista;

public class ExercicioSeis {

    public static void main(String[] args) {

        int [] numeros = {82, 15, 4, 95, 36, 32};
        int maiorNumero = 0;

        for(int i = 0; i < numeros.length; i++){

            if(numeros[i] > maiorNumero){
                maiorNumero = numeros[i];
            }
        }
        System.out.println(maiorNumero);
    }
}
