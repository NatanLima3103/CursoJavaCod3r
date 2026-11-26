package stream.outros.exercicioQuatro;

public class Pedido {

    private String cliente;
    private String bairro;
    private double valor;

    public Pedido(String cliente, String bairro, double valor){
        this.cliente = cliente;
        this.bairro = bairro;
        this.valor = valor;
    }

    public String getCliente(){
        return cliente;
    }

    public String getBairro(){
        return bairro;
    }

    public double getValor(){
        return valor;
    }
}
