package oo.modificadoresDeAcesso.exercicioDois;

public class Produto {

    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    private boolean TemEstoque(int qtd){
        return estoque >= qtd;
    }

    public void vender(int qtd){
        if(qtd <= 0){
            System.out.println("Quantidade inválida");
        } else if (TemEstoque(qtd) == false) {
            System.out.println("Estoque insuficiente");
        } else{
            estoque = estoque - qtd;
        }
    }

    public void reajustar(double percentual){
        preco = preco + preco * percentual / 100;
    }

    public double valorEmEstoque(){
        return preco * estoque;
    }

    public String resumo(){
        return nome + " - R$ " + preco + " - estoque: " + estoque;
    }
}
