package oo.gettersESetters.exercicioDois;

public class Aluno {
    private String nome;
    private double nota;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getNota(){
        return nota;
    }

    public void setNota(double nota){
        if(nota < 0){
            this.nota = 0;
        } else if (nota > 10) {
            this.nota = 10;
        } else {
            this.nota = nota;
        }
    }
}
