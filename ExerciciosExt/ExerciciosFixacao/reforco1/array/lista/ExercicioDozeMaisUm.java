package reforco1.array.lista;

public class ExercicioDozeMaisUm {

    public static void main(String[] args) {

        String [] palavras = {"Natan", "Oi", "Tem", "Jonatan", "Celular", "PC"};
        int contador = 0;

        for (int i = 0; i < palavras.length; i++) {

            if(palavras[i].length() > 4){

                contador++;
            }
        }
        System.out.println(contador);
    }
}
