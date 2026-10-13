package oo.gettersESetters.exercicioDois;

import java.util.ArrayList;

public class Turma {
    public static void main(String[] args) {

        Aluno natan = new Aluno();
        natan.setNome("Natan");
        natan.setNota(8.5);

        Aluno lima = new Aluno();
        lima.setNome("Lima");
        lima.setNota(-3);

        Aluno aline = new Aluno();
        aline.setNome("Aline");
        aline.setNota(11);

        Aluno fiori = new Aluno();
        fiori.setNome("Fiori");
        fiori.setNota(7);

        ArrayList<Aluno> alunos = new ArrayList<>();

        alunos.add(natan);
        alunos.add(lima);
        alunos.add(aline);
        alunos.add(fiori);

        double soma = 0;
        int contador = 0;

        for (Aluno a : alunos){
            System.out.println(a.getNome() + " - " + a.getNota());
            soma = soma + a.getNota();
            contador++;
        }
        double media = soma / contador;

        System.out.println("A média foi: " + media);
        System.out.println("A soma foi: " + soma);
    }
}
