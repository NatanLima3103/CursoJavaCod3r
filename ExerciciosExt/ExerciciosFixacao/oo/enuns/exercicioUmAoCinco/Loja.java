package oo.enuns.exercicioUmAoCinco;

import java.util.ArrayList;
import java.util.List;

public class Loja {

    String nome;
    List<Pedido> pedidos = new ArrayList<>();

    Loja(String nome) {
        this.nome = nome;
    }

    void adicionarPedido(Pedido pedido){

        pedidos.add(pedido);
    }

    int contarPorStatus(StatusPedido status){
        int contador = 0;

        for(Pedido p : pedidos){

            if(p.status == status){
                contador++;
            }
        }
        return contador;
    }

    int totalCancelaveis(){
        int total = 0;

        for (Pedido p : pedidos){

            if(p.podeCancelar()){

                total++;
            }
        }
        return total;
    }
}
