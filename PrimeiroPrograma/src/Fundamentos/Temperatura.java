package Fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        // (°F - 32) x 5/9 = °C
        final double AJUSTE = 32;
        final double FATOR = 5.0/9.0;

        double f = 86;
        double celsius = (f - AJUSTE) * FATOR;

        System.out.println("A temperatura em Celsius é: " + celsius);

        f = 150;
        celsius = (f - AJUSTE) * FATOR;

        System.out.println("A temperatura em Celsius é: " + celsius);
    }
}
