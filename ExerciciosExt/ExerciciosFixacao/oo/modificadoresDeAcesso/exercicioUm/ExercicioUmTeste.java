package oo.modificadoresDeAcesso.exercicioUm;

public class ExercicioUmTeste {

    public static void main(String[] args) {

        ContaBancaria c1 = new ContaBancaria("Natan Lima", 100.0);

        c1.depositar(50);
        c1.sacar(30);
        c1.sacar(500);
        c1.depositar(-10);

        System.out.println(c1.resumo());
    }
}
