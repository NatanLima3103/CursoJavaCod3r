package oo.herenca.exercicioOito;

public class Moto extends Veiculo{

    Moto(String modelo){

        super(modelo);
    }

    @Override
    double calcularPedagio() {
        return super.calcularPedagio() / 2;
    }
}
