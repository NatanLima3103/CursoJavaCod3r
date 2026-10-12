package oo.modificadoresDeAcesso.exercicioOito;

public class ExercicioOitoTeste {
    public static void main(String[] args) {
        Turma t = new Turma();

        t.matricular("Natan");
        t.matricular("Aline");
        t.matricular("Lucca");
        t.matricular("Natan");

        t.lancar("Natan", 8.5);
        t.lancar("Aline", 4.0);
        t.lancar("Lucca", 11.0);
        t.lancar("Lima", 7.0);

        t.relatorio();
    }
}
