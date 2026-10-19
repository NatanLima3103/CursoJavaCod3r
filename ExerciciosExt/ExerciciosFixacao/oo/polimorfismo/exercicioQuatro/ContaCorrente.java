package oo.polimorfismo.exercicioQuatro;

public class ContaCorrente extends Conta{

    public ContaCorrente(String titular, double saldo){
        super(titular, saldo);
    }

    @Override
    public boolean sacar(double valor) {
        return super.sacar(valor + 2.0);
    }
}
