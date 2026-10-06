package oo.composicao.exercicioDozeMaisUm;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    Cliente cliente;
    List<Item> itens = new ArrayList<>();

    Pedido(Cliente cliente){
        this.cliente = cliente;
    }

    void adicionarItem(Item item){

        itens.add(item);
    }

    double calcularTotal(){
        double somaTotal = 0;

        for (Item item : itens){

            somaTotal = somaTotal + item.subtotal();
        }
        return somaTotal;
    }

    boolean entregaGratis(){
        return calcularTotal() >= 150.0;
    }

    String descrever(){

        return "Pedido de: " + cliente.nome + " para a cidade de " + cliente.endereco.cidade + " " + itens.size() + " itens, total de R$ " + calcularTotal();
    }
}
