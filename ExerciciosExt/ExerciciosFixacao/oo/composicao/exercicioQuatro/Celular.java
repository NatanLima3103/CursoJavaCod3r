package oo.composicao.exercicioQuatro;

public class Celular {

    String modelo;
    Bateria bateria;

    Celular(String modelo, Bateria bateria){
        this.modelo = modelo;
        this.bateria = bateria;
    }

    String usar(int quantidade){
        if(bateria.nivel == 0){
            return modelo + " sem bateria.";
        } else {
            bateria.gastar(quantidade);
            return modelo + " usado. Bateria: " + bateria.nivel + "%";
        }
    }
}
