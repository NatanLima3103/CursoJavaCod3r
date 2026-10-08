package oo.herenca.exercicioNove;

public class ReservaLuxo extends Reserva{

    double taxaDeServico;

    ReservaLuxo(String hospede, int diarias, double valorDiaria, double taxaDeServico){
        super(hospede, diarias, valorDiaria);
        this.taxaDeServico = taxaDeServico;

    }

    @Override
    double calcularTotal() {
        return super.calcularTotal() + taxaDeServico;
    }
}
