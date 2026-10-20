package oo.polimorfismo.exercicioNove;

public class Ingresso {

    private String cliente;

    public Ingresso(String cliente){
        this.cliente = cliente;
    }

    public String getCliente() {
        return cliente;
    }

    public double calcularPreco(){
        return 40.0;
    }
}
