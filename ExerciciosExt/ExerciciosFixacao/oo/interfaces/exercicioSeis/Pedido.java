package oo.interfaces.exercicioSeis;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    String cliente;
    List<ItemCardapio> itens;

    public Pedido(String cliente){
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionar(ItemCardapio item){
        itens.add(item);
    }


    public double calcularTotal(){
        double total = 0;
        for (ItemCardapio i : itens){
            total += i.getPreco();
        }
        return total;
    }

    public void imprimirResumo(){
        System.out.println("Pedido de " + cliente);
        for (ItemCardapio i : itens){
            System.out.println(i.getNome() + ": - R$ " + i.getPreco());
        }
        System.out.println("Total: R$ " + calcularTotal());
    }
}
