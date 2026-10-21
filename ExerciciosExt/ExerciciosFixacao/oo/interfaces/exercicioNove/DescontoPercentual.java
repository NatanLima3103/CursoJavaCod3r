package oo.interfaces.exercicioNove;

public class DescontoPercentual implements Desconto{
    double percentual;

    public DescontoPercentual(double percentual){
        this.percentual = percentual;
    }

    @Override
    public String getDescricao() {
        return "Desconto de " + percentual + "%";
    }

    @Override
    public double aplicar(double valor) {
        return valor - (valor * percentual / 100);
    }
}
