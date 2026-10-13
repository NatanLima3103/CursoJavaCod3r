package oo.modificadoresDeAcesso.exercicioNove;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<Item> itens = new ArrayList<>();

    public Estoque(){

    }

    private Item buscar(String codigo){
        for(Item i : itens){
            if(i.getCodigo().equals(codigo)){
                return i;
            }
        }
        return null;
    }

    public void cadastrar(String codigo){
        if(buscar(codigo) != null){
            System.out.println("Código já cadastrado: " + codigo);
        } else {
            Item novo = new Item(codigo);
            itens.add(novo);
        }
    }

    public void movimentar(String codigo, int q, boolean entrada){
        Item i = buscar(codigo);
        if (i == null){
            System.out.println("Item não encontrado: " + codigo);
        } else if (entrada == true){
            i.entrada(q);
        } else {
            i.saida(q);
        }
    }

    public void relatorio(){
        int contadorZerados = 0;
        for (Item i : itens){
            System.out.println(i.resumo());
            if(i.zerado()){
                contadorZerados++;
            }
        }
        System.out.println("Itens zerados: " + contadorZerados);
    }
}
