package Fundamentos;

public class AreaCircunferencia {
    public static void main (String[] args) {
        double raio = 10;
        final double PI = 3.14159; // final faz com que se torne uma constante

        double area = PI * raio * raio;
        System.out.println(area);

        raio = 10;
        area = PI * raio * raio;
        System.out.println("Área = " + area);
    }
}
