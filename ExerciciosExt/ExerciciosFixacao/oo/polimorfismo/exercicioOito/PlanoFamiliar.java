package oo.polimorfismo.exercicioOito;

public class PlanoFamiliar extends Plano{
    private int dependentes;

    PlanoFamiliar(String titular, double mensalidadeBase, int dependentes){
        super(titular, mensalidadeBase);
        this.dependentes = dependentes;
    }

    @Override
    public double calcularMensalidade() {
        return super.calcularMensalidade() + dependentes * 35.0;
    }
}
