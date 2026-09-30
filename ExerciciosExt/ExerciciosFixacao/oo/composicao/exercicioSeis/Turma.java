package oo.composicao.exercicioSeis;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    String nome;
    List<Aluno> alunos = new ArrayList<>();

    Turma(String nome){

        this.nome = nome;
    }

    void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    void listarAlunos(){
        for(Aluno aluno : alunos){
            System.out.println(aluno.nome);
        }
    }
}
