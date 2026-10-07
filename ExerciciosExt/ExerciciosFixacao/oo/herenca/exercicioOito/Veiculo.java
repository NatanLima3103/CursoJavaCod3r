package oo.herenca.exercicioOito;

public class Veiculo {

    String modelo;

    Veiculo(String modelo){

        this.modelo = modelo;
    }

    double calcularPedagio(){

        return 10;
    }

    String descrever(){

        return "Veículo: " + modelo;
    }
}
