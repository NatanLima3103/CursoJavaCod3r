package lambda.predicate.exercicioDez;

public class Pedido {

    private String cliente;
    private double valor;
    private int itens;
    private boolean entregue;

    public Pedido(String cliente, double valor, int itens, boolean entregue){
        this.cliente = cliente;
        this.valor = valor;
        this.itens = itens;
        this.entregue = entregue;
    }

    public String getCliente(){
        return cliente;
    }

    public double getValor(){
        return valor;
    }

    public int getItens(){
        return itens;
    }

    public boolean isEntregue(){
        return entregue;
    }
}
