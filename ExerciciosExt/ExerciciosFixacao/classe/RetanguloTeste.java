package classe;

import java.util.Scanner;

public class RetanguloTeste {

    public static void main(String [] args) {

        Scanner entrada = new Scanner(System.in);

        Retangulo forma1 = new Retangulo();
        System.out.println("Informe a altura do retangulo: ");
        forma1.altura = entrada.nextDouble();
        System.out.println("Informe a largura do retangulo: ");
        forma1.largura = entrada.nextDouble();
        
        System.out.println(forma1.calcularArea());
    }
}
