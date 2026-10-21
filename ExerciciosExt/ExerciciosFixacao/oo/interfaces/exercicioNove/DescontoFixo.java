package oo.interfaces.exercicioNove;

public class DescontoFixo implements Desconto{

    double abatimento;

    public DescontoFixo(double abatimento){
        this.abatimento = abatimento;
    }

    @Override
    public String getDescricao() {
        return "Desconto fixo de R$ " + abatimento;
    }

    @Override
    public double aplicar(double valor) {
        if (abatimento - valor > 0){
            return 0;
        }
        return valor - abatimento;
    }
}
