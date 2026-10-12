package oo.modificadoresDeAcesso.exercicioOito;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Turma {

    private ArrayList<Aluno> alunos = new ArrayList<>();

    public Turma(){

    }

    private Aluno buscar(String nome){
        for(Aluno a : alunos){
            if(a.getNome().equals(nome)){
                return a;
            }
        }
        return null;
    }

    public void matricular(String nome){
        if(buscar(nome) != null){
            System.out.println("Aluno já matriculado: " + nome);
        } else {
            Aluno novo = new Aluno(nome);
            alunos.add(novo);
        }
    }

    public void lancar(String nome, double n){
        Aluno a = buscar(nome);
        if (a == null){
            System.out.println("Aluno não encontrado: " + nome);
        } else {
            a.lancarNota(n);
        }
    }

    public void relatorio(){
        int qtd = 0;
        for(Aluno a : alunos){
            System.out.println(a.resumo());
            if(a.aprovado()){
                qtd++;
            }
        }
        System.out.println("Aprovados: " + qtd);
    }

}
