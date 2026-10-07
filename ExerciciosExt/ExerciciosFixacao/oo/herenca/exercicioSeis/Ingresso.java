package oo.herenca.exercicioSeis;

public class Ingresso {

    String evento;
    double valor;

    Ingresso(String evento, double valor){

        this.evento = evento;
        this.valor = valor;
    }

    String detalhes(){

        return evento + " - R$ " + valor;
    }
}
