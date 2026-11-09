package lambda.supplier.exercicioDois;

public class Ingresso {

    private String evento;
    private double preco;

    public Ingresso(String evento, double preco){
        this.evento = evento;
        this.preco = preco;
    }

    public String getEvento(){
        return evento;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
}
