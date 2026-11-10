package lambda.supplier.exercicioCinco;

public class Comanda {

    private String cliente;
    private int mesa;
    private double total;

    public Comanda(String cliente, int mesa){
        this.cliente = cliente;
        this.mesa = mesa;
        total = 0.0;
    }

    public String getCliente(){
        return cliente;
    }

    public int getMesa(){
        return mesa;
    }

    public double getTotal(){
        return total;
    }

    public double adicionar(double valor){
        return total += valor;
    }
}
