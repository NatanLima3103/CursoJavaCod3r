package oo.abstracao.exercicioUm;

public class Carro extends Veiculo {

    public Carro(String placa){
        super(placa);
    }

    @Override
    public double calcularPedagio() {
        return 10;
    }
}
