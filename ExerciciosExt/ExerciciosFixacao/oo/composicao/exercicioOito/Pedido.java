package oo.composicao.exercicioOito;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    String cliente;
    List<Item> itens = new ArrayList<>();

    Pedido(String cliente) {

        this.cliente = cliente;
    }

    void adicionarItem(Item item){
        itens.add(item);
    }

    double calcularTotal () {
        double calculoTotal = 0;
        for(Item item : itens){

            calculoTotal = calculoTotal + item.subtotal();
        }
        return calculoTotal;
    }

    int contarUnidades(){
        int contador = 0;

        for(Item item : itens){
            contador = item.quantidade + contador;
        }
        return contador;
    }
}
