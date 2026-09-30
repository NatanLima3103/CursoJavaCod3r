package oo.composicao.exercicioSeis;

public class ExercicioSeisTeste {

    public static void main(String[] args) {

        Turma turma = new Turma("Java 2026");

        Aluno a1 = new Aluno("Natan");
        Aluno a2 = new Aluno("Lima");
        Aluno a3 = new Aluno("Aline");

        turma.adicionarAluno(a1);
        turma.adicionarAluno(a2);
        turma.adicionarAluno(a3);

        turma.listarAlunos();
        System.out.println(turma.alunos.size());
    }
}
