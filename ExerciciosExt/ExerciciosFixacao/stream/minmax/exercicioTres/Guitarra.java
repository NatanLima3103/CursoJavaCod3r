package stream.minmax.exercicioTres;

public class Guitarra {

    private String modelo;
    private double preco;
    private int ano;

    public Guitarra(String modelo, double preco, int ano){
        this.modelo = modelo;
        this.preco = preco;
        this.ano = ano;
    }

    public String getModelo(){
        return modelo;
    }

    public double getPreco(){
        return preco;
    }

    public int getAno(){
        return ano;
    }
}
