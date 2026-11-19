package stream.map.exercicioCinco;

public class Reserva {

    private String cliente;
    private int horas;
    private double valorHora;

    public Reserva(String cliente, int horas, double valorHora){
        this.cliente = cliente;
        this.horas = horas;
        this.valorHora = valorHora;
    }

    public String getCliente(){
        return cliente;
    }

    public int getHoras(){
        return horas;
    }

    public double getValorHora(){
        return valorHora;
    }
}
