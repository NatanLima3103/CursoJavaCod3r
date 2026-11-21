package stream.filter.exercicioTres;

public class Candidato {

    private String nome;
    private int anosExperiencia;
    private double nota;
    private boolean remoto;

    public Candidato(String nome, int anosExperiencia, double nota, boolean remoto){
        this.nome = nome;
        this.anosExperiencia = anosExperiencia;
        this.nota = nota;
        this.remoto = remoto;
    }

    public String getNome(){
        return nome;
    }

    public int getAnosExperiencia(){
        return anosExperiencia;
    }

    public double getNota(){
        return nota;
    }

    public boolean isRemoto(){
        return remoto;
    }
}
