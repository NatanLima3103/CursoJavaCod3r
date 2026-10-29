package lambda.consumer.exercicioDez;

public class Encomenda {

    private String codigo;
    private double peso;
    private String status;
    private double frete;

    public Encomenda(String codigo, double peso){
        this.codigo = codigo;
        this.peso = peso;
        status = "AGUARDANDO";
        frete = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPeso() {
        return peso;
    }

    public String getStatus() {
        return status;
    }

    public double getFrete() {
        return frete;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }
}
