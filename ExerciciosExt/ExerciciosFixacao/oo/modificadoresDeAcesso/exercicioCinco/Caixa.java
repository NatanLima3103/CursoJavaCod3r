package oo.modificadoresDeAcesso.exercicioCinco;

import java.util.ArrayList;

public class Caixa {
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    private double recebido;

    public Caixa(){

    }

    public void registrar(Pedido p){
        pedidos.add(p);
    }

    public void fecharCaixa(){
        recebido = 0;
        for(Pedido p : pedidos){
            recebido = recebido + p.getValorSePago();
        }
        System.out.println("Recebido: R$ " + recebido);
    }

    public void listar(){
        for (Pedido p : pedidos){
            System.out.println(p.resumo());
        }
    }
}
