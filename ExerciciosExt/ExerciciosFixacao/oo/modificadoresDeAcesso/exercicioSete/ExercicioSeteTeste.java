package oo.modificadoresDeAcesso.exercicioSete;

public class ExercicioSeteTeste {
    public static void main(String[] args) {

        Conta a = new Conta("Natan", 200.0);
        Conta b = new Conta("Aline", 50.0);

        a.transferir(b, 80.0);
        b.transferir(a, 500.0);
        a.transferir(b, -10.0);

        System.out.println(a.resumo());
        System.out.println(b.resumo());
    }
}
