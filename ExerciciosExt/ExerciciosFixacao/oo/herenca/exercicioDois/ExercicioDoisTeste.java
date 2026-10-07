package oo.herenca.exercicioDois;

public class ExercicioDoisTeste {

    public static void main(String[] args) {

        Gerente g1 = new Gerente("Natan", 10000.00, 2500.00);
        Estagiario e1 = new Estagiario("Lima", 2500.00, "UP");

        System.out.println(g1.apresentar());
        System.out.println(e1.apresentar());

        System.out.println(g1.calcularTotal());
        System.out.println(e1.getFaculdade());
        }
    }