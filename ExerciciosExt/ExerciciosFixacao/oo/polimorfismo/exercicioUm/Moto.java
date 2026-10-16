package oo.polimorfismo.exercicioUm;

public class Moto extends Veiculo{

    public Moto(String placa){
        super(placa);
    }

    @Override
    public double calcularPedagio() {
        return 6.0;
    }
}
