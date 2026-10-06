package oo.composicao.exercicioDoze;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    String nome;
    Professor professor;
    List<Aluno> alunos = new ArrayList<>();

    Turma(String nome,Professor professor){

        this.nome = nome;
        this.professor = professor;
    }

    void adicionarAluno(Aluno aluno) {

        alunos.add(aluno);
    }

    double calcularMedia(){
        if(alunos.size() == 0){
            return 0;
        }

        double soma = 0;
        for(Aluno aluno: alunos){
            soma = soma + aluno.nota;
        }
        return soma / alunos.size();
    }

    int contarAprovados(){
        int contador = 0;
        for(Aluno aluno : alunos){
            if(aluno.nota >= 7){
                contador++;
            }
        }

        return contador;
    }

    String descrever(){
        return nome + " - Prof. " + professor.nome + " (" + professor.disciplina + "): " + alunos.size() + " alunos";
    }
}
