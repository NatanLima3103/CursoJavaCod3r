package lambda.consumer.exercicioCinco;

public class Carrinho {

    private double total = 0;

    public double adicionar(double valor){
        return total += valor;
    }

    public double getTotal() {
        return total;
    }
}
