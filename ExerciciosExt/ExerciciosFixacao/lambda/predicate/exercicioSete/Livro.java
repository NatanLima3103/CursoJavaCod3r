package lambda.predicate.exercicioSete;

public class Livro {

    private String nome;
    private int paginas;
    private boolean disponivel;

    public Livro(String nome, int paginas, boolean disponivel){
        this.nome = nome;
        this.paginas = paginas;
        this.disponivel = disponivel;
    }

    public String getNome(){
        return nome;
    }

    public int getPaginas(){
        return paginas;
    }

    public boolean isDisponivel(){
        return disponivel;
    }
}
