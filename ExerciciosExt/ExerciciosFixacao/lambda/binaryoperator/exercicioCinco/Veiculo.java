package lambda.binaryoperator.exercicioCinco;

public class Veiculo {
    private String placa;
    private Integer horas;

    public Veiculo(String placa, Integer horas){
        this.placa = placa;
        this.horas = horas;
    }

    public String getPlaca(){
        return placa;
    }

    public Integer getHoras(){
        return horas;
    }
}
