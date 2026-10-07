package oo.herenca.exercicioSete;

public class Pedido {

    double valor;

    Pedido(double valor){

        this.valor = valor;
    }

    double calcularTotal(){

        return valor;
    }

    String resumo(){

        return "Pedido de R$ " + valor;
    }
}
