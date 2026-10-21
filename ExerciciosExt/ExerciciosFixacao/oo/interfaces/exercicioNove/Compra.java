package oo.interfaces.exercicioNove;

public class Compra {
    private double valor;
    private Desconto desconto;

    public Compra(double valor){
        this.valor = valor;
        this.desconto = new SemDesconto();
    }

    void setDesconto(Desconto desconto){
        this.desconto = desconto;
    }

    double calcularTotal(){
        return desconto.aplicar(valor);
    }

    void imprimir(){
        System.out.println("Compra de R$ " + valor);
        System.out.println("Regra: " + desconto.getDescricao());
        System.out.println("Total: R$ " + calcularTotal());
    }
}
