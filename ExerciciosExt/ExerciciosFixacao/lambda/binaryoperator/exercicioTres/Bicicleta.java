package lambda.binaryoperator.exercicioTres;

public class Bicicleta {

    private String modelo;
    private Double precoHora;

    public Bicicleta(String modelo, Double precoHora){
        this.modelo = modelo;
        this.precoHora = precoHora;
    }

    public String getModelo(){
        return modelo;
    }

    public Double getPrecoHora(){
        return precoHora;
    }
}
