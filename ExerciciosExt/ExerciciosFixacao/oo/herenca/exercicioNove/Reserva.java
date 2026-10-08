package oo.herenca.exercicioNove;

public class Reserva {

    String hospede;
    int diarias;
    double valorDiaria;

    Reserva(String hospede, int diarias, double valorDiaria){

        this.hospede = hospede;
        this.diarias = diarias;
        this.valorDiaria = valorDiaria;
    }

    double calcularTotal(){

        return diarias * valorDiaria;
    }

    String resumo(){

        return hospede + " - total: R$ " + calcularTotal();
    }
}
