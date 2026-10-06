package oo.composicao.exercicioDoze;

public class ExercicioDozeTeste {
    public static void main(String[] args) {

        Professor prof = new Professor("Natan", "Java");
        Aluno a1 = new Aluno("Lima", 8.0);
        Aluno a2 = new Aluno("Aline", 5.5);
        Aluno a3 = new Aluno("Fiori", 9.5);

        Turma t1 = new Turma("Java 2026", prof);
        t1.adicionarAluno(a1);
        t1.adicionarAluno(a2);
        t1.adicionarAluno(a3);

        Turma t2 = new Turma("Vazia", prof);

        System.out.println(t1.descrever());
        System.out.println(t1.calcularMedia());
        System.out.println(t1.contarAprovados());
        System.out.println(t2.calcularMedia());
    }
}
