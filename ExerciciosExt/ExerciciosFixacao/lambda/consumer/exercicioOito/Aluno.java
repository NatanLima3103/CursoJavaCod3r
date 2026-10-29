package lambda.consumer.exercicioOito;

public class Aluno {

    private String nome;
    private double nota;
    private String situacao;

    public Aluno(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
        situacao = "PENDENTE";
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
