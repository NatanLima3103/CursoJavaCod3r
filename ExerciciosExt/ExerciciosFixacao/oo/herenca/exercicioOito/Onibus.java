package oo.herenca.exercicioOito;

public class Onibus extends Veiculo{

    Onibus(String modelo){
        super(modelo);
    }

    @Override
    double calcularPedagio() {
        return 25.0;
    }
}
