package oo.modificadoresDeAcesso.exercicioTres;

public class ExercicioTresTeste {

    public static void main(String[] args) {
        Cofre c1 = new Cofre(1234, 2500.0);

        c1.abrir(1111);
        c1.abrir(2222);
        c1.abrir(1234);
        c1.abrir(1111);
        c1.abrir(2222);
        c1.abrir(3333);
        c1.abrir(1234);

        System.out.println(c1.resumo());
    }
}