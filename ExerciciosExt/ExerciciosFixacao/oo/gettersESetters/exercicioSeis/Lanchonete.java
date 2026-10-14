package oo.gettersESetters.exercicioSeis;

import java.util.ArrayList;

public class Lanchonete {
    public static void main(String[] args) {
        ItemPedido xBurguer = new ItemPedido();
        xBurguer.setNome("X-Burguer");
        xBurguer.setPrecoUnitario(25.0);
        xBurguer.setQuantidade(2);
        xBurguer.setDescontoPercentual(0);

        ItemPedido batata = new ItemPedido();
        batata.setNome("Batata");
        batata.setPrecoUnitario(12.0);
        batata.setQuantidade(5);
        batata.setDescontoPercentual(10);

        ItemPedido refrigerante = new ItemPedido();
        refrigerante.setNome("Refrigerante");
        refrigerante.setPrecoUnitario(6.0);
        refrigerante.setQuantidade(4);
        refrigerante.setDescontoPercentual(50);

        ArrayList<ItemPedido> itens = new ArrayList<>();

        itens.add(xBurguer);
        itens.add(batata);
        itens.add(refrigerante);

        double somaSubtotal = 0;
        double somaTotal = 0;

        for (ItemPedido i : itens){
            somaSubtotal = somaSubtotal + i.getSubtotal();
            somaTotal = somaTotal + i.getTotal();
            System.out.println("Nome: " + i.getNome() + ", subtotal: " + i.getSubtotal() + ", total: " + i.getTotal());
        }

        double economia = somaSubtotal - somaTotal;

        System.out.println("Soma do subtotal: " + somaSubtotal);
        System.out.println("Soma total: " + somaTotal);
        System.out.println("O valor economizado foi: " + economia);
    }
}
