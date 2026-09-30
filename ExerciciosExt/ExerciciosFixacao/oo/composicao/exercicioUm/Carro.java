package oo.composicao.exercicioUm;

public class Carro {

    String modelo;
    Motor motor;

    Carro (String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    String ligarCarro(){
        motor.ligar();
        return modelo + " ligado!, potência é de: " + motor.cavalos + " cavalos.";
    }

    String desligarCarro(){
        motor.desligar();
        return modelo + " desligado";

    }
}