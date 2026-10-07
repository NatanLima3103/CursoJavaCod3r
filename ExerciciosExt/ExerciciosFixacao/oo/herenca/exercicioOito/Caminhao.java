package oo.herenca.exercicioOito;

public class Caminhao extends Veiculo{

    int eixos;

    Caminhao(String modelo, int eixos){

        super(modelo);
        this.eixos = eixos;
    }

    @Override
    double calcularPedagio() {
        return super.calcularPedagio() * eixos;
    }

    @Override
    String descrever() {
        return super.descrever() + " | Eixos: " + eixos;
    }
}
