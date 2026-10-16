package oo.polimorfismo.exercicioUm;

public class Caminhao extends Veiculo{

    private int eixos;

    public Caminhao(String placa, int eixos){
        super(placa);
        this.eixos = eixos;
    }

    @Override
    public double calcularPedagio() {
        return 15.0 * eixos;
    }
}
