package lambda.consumer.exercicioDez;

public class Painel {

    private double totalFrete = 0;
    private int despachadas = 0;

    void registrar(double frete){
        totalFrete += frete;
        despachadas++;
    }

    public double getTotalFrete() {
        return totalFrete;
    }

    public int getDespachadas() {
        return despachadas;
    }
}
