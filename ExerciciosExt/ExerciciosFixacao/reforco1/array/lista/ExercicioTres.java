package ExerciciosFixacao.reforco1.array.lista;

public class ExercicioTres {

    public static void main(String[] args) {

        double [] valor = {1.25, 3.14, 5.78, 8.91, 2.46};
        double soma = 0;
        double media = 0;

        for (int i = 0; i < valor.length; i++){
            soma = valor[i] + soma;
        }
        media = soma / valor.length;

        System.out.println(soma);
        System.out.println(media);
    }
}
