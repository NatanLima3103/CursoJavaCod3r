package oo.polimorfismo.exercicioCinco;

import java.util.ArrayList;

public class ExercicioCindoTeste {
    public static void main(String[] args) {
        Forma[] formas = { new Retangulo(4, 5), new Quadrado(3), new Triangulo(6, 5) };

        double areaTotal = 0;

        for (Forma f : formas){
            System.out.println(f.descrever());
            areaTotal += f.calcularArea();
        }
        System.out.println("A área total é: " + areaTotal);
    }
}
