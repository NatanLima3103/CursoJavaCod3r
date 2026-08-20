package classe;

public class Ingresso {

    String ingresso;
    double precoBase;

    public double calcularPrecoComTaxa(double percentualTaxa) {
        return precoBase + (precoBase * percentualTaxa / 100);
    }

}
