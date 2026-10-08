package oo.herenca.exercicioNove;

public class ReservaLongaEstadia extends Reserva{

    ReservaLongaEstadia(String hospede, int diarias, double valorDiaria){

        super(hospede, diarias, valorDiaria);
    }

    @Override
    double calcularTotal() {
        if(diarias >= 7){
            return super.calcularTotal() - super.calcularTotal() * 15 / 100;
        }
        return super.calcularTotal();
    }
}
