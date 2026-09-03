package ExerciciosFixacao.reforco2.ififelseifelseif;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número de 1 até 12, correspondendo ao mês desejado: ");
        int mes = entrada.nextInt();

        if(mes >= 1 && mes <= 12){
            if(mes == 12 || mes == 1 || mes == 2){
                System.out.println("A estação correspondente é o verão!");
            } else if (mes == 3 || mes == 4 || mes == 5) {
                System.out.println("A estação correspondente é o outono!");
            } else if (mes == 6 || mes == 7 || mes == 8) {
                System.out.println("A estação correspondente é o inverno!");
            } else {
                System.out.println("A estação correspondente é a primavera!");
            }
        }else{
            System.out.println("Mês inexistente, tente novamente, com um número correspondente válido.");
        }
    }
}
