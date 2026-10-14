package oo.gettersESetters.exercicioSeis;

public class ItemPedido {
    private String nome;
    private double precoUnitario;
    private int quantidade;
    private double descontoPercentual;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPrecoUnitario(){
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario){
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public double getDescontoPercentual(){
        return descontoPercentual;
    }

    public void setDescontoPercentual(double descontoPercentual){
        this.descontoPercentual = descontoPercentual;
    }

    public double getSubtotal(){
        return precoUnitario * quantidade;
    }

    public double getTotal(){
        double desconto = getSubtotal() * getDescontoPercentual() / 100;
        return getSubtotal() - desconto;
    }
}
