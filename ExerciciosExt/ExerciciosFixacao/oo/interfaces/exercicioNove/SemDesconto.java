package oo.interfaces.exercicioNove;

public class SemDesconto implements Desconto{

    public SemDesconto(){

    }

    @Override
    public String getDescricao() {
        return "Sem desconto";
    }

    @Override
    public double aplicar(double valor) {
        return valor;
    }
}
