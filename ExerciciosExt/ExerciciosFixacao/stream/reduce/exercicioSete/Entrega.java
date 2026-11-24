package stream.reduce.exercicioSete;

public class Entrega {

    private String produtor;
    private int sacas;
    private double precoSaca;
    private boolean certificado;

    public Entrega(String produtor, int sacas, double precoSaca, boolean certificado){
        this.produtor = produtor;
        this.sacas = sacas;
        this.precoSaca = precoSaca;
        this.certificado = certificado;
    }

    public String getProdutor(){
        return produtor;
    }

    public int getSacas(){
        return sacas;
    }

    public double getPrecoSaca(){
        return precoSaca;
    }

    public boolean isCertificado(){
        return certificado;
    }
}
