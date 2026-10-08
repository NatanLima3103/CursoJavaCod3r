package oo.modificadoresDeAcesso.exercicioQuatro;

import java.util.ArrayList;

public class Carrinho {
    private ArrayList<String> itens = new ArrayList<>();
    private double total;
    private double limite;

    public Carrinho(double limite){
        this.limite = limite;
    }

    private boolean jaExiste(String nome){
        if(itens.contains(nome)){
            return true;
        }
        return false;
    }

    public void adicionar(String nome, double preco){
        if(preco <= 0){
            System.out.println("Preço inválido");
        } else if (jaExiste(nome)){
            System.out.println("Item repetido: " + nome);
        } else if (total + preco > limite) {
            System.out.println("Limite excedido: " + nome);
        } else {
            itens.add(nome);
            total = preco + total;
        }
    }
    public void remover(String nome, double preco){
        if(jaExiste(nome)){
            itens.remove(nome);
            total = total - preco;
        } else {
            System.out.println("Item não encontrado: " + nome);
        }
    }

    public String resumo(){
        return itens.size() + " itens - total: R$ " + total;
    }
}
