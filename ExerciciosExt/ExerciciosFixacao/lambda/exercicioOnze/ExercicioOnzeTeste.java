package lambda.exercicioOnze;

import java.util.ArrayList;

public class ExercicioOnzeTeste {

    static void mostrarGorjetas(String titulo, double[] contas, PoliticaGorjeta politica){
        System.out.println(titulo);

        for (double conta : contas){
            System.out.println("Conta: " + conta + " | Gorjeta: " + politica.calcular(conta));
        }
    }

    public static void main(String[] args) {
        double[] contas = { 80.0, 100.0, 200.0};

        mostrarGorjetas("--- Gorjeta fixa de 10% ---", contas, conta -> conta * 10 / 100);

        mostrarGorjetas("--- Gorjeta progresiva ---", contas, conta -> {
            if (conta <= 100){
                return conta * 10/100;
            }
            return conta * 15/100;
        });
    }
}
