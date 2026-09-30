package oo.composicao.exercicioTres;

public class ExercicioTresTeste {

    public static void main(String[] args) {

        Cracha c1 = new Cracha(1234);
        Funcionario f1 = new Funcionario("Natan", c1);

        System.out.println(f1.entrar());
        c1.bloquear();
        System.out.println(f1.entrar());
    }
}
