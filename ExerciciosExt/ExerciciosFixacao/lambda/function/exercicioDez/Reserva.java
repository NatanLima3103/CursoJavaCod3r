package lambda.function.exercicioDez;

public class Reserva {

    private String hospede;
    private int diarias;
    private double valorDiaria;

    public Reserva(String hospede, int diarias, double valorDiaria){
        this.hospede = hospede;
        this.diarias = diarias;
        this.valorDiaria = valorDiaria;
    }

    public String getHospede(){
        return hospede;
    }

    public int getDiarias(){
        return diarias;
    }

    public double getValorDiaria(){
        return valorDiaria;
    }
}
