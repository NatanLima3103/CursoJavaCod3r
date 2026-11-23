package stream.reduce.exercicioDois;

public class Lavagem {

    private String placa;
    private String tipo;
    private double valor;
    private int minutos;

    public Lavagem (String placa, String tipo, double valor, int minutos){
        this.placa = placa;
        this.tipo = tipo;
        this.valor = valor;
        this.minutos = minutos;
    }

    public String getPlaca() {
        return placa;
    }

    public String getTipo(){
        return tipo;
    }

    public double getValor(){
        return valor;
    }

    public int getMinutos(){
        return minutos;
    }
}
