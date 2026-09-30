package oo.composicao.exercicioTres;

public class Cracha {

    int numero;
    boolean ativo = true;

    Cracha(int numero){

        this.numero = numero;
    }

    void bloquear(){

        ativo = false;
    }
}
