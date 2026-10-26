package lambda.exercicioDez;

public class Aluno {
    private String nome;
    private String plano;
    private int mesesDeCasa;

    public Aluno(String nome, String plano, int mesesDeCasa){
        this.nome = nome;
        this.plano = plano;
        this.mesesDeCasa = mesesDeCasa;
    }

    public String getNome() {
        return nome;
    }

    public String getPlano() {
        return plano;
    }

    public int getMesesDeCasa() {
        return mesesDeCasa;
    }
}
