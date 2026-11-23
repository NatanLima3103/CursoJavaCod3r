package stream.filter.exercicioCinco;

public class Vinho {

    private String nome;
    private int safra;
    private double preco;
    private int estoque;

    public Vinho(String nome, int safra, double preco, int estoque){
        this.nome = nome;
        this.safra = safra;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome(){
        return nome;
    }

    public int getSafra(){
        return safra;
    }

    public double getPreco(){
        return preco;
    }

    public int getEstoque(){
        return estoque;
    }
}
