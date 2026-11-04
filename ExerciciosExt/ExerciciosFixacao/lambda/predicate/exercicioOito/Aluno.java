package lambda.predicate.exercicioOito;

public class Aluno {

    private String nome;
    private double nota;
    private int frequencia;

    public Aluno(String nome, double nota, int frequencia){
        this.nome = nome;
        this.nota = nota;
        this.frequencia = frequencia;
    }

    public String getNome(){
        return nome;
    }

    public double getNota(){
        return nota;
    }

    public int getFrequencia(){
        return frequencia;
    }
}
