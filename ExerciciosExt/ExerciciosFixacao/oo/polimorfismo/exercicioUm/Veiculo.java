package oo.polimorfismo.exercicioUm;

public class Veiculo {
    private String placa;

    public Veiculo(String placa){
        this.placa = placa;
    }

    public String getPlaca(){
        return placa;
    }

    public double calcularPedagio(){
        return 0.0;
    }
}
