package stream.map.exercicioDez;

public class Fatura {

    private String paciente;
    private double valorFinal;

    public Fatura(String paciente, double valorFinal){
        this.paciente = paciente;
        this.valorFinal = valorFinal;
    }

    public String getPaciente(){
        return paciente;
    }

    public double getValorFinal(){
        return valorFinal;
    }

    @Override
    public String toString() {
        return "Fatura de " + paciente + ": R$ " + valorFinal;
    }
}
