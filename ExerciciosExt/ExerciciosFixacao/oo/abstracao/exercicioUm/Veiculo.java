package oo.abstracao.exercicioUm;

public abstract class Veiculo {
    String placa;

    public Veiculo(String placa){
        this.placa = placa;
    }

    public String identificar(){
        return "Veículo de placa " + placa;
    }

    public abstract double calcularPedagio();
}
