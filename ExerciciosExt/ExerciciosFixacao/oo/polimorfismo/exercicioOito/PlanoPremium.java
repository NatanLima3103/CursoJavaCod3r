package oo.polimorfismo.exercicioOito;

public class PlanoPremium extends Plano{
    public PlanoPremium(String titular, double mensalidadeBase){
        super(titular, mensalidadeBase);
    }

    @Override
    public double calcularMensalidade() {
        return super.calcularMensalidade() + 40.0;
    }
}
