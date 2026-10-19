package oo.polimorfismo.exercicioQuatro;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(String titular, double saldo){
        super(titular, saldo);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 500.0){
            return false;
        }
        return super.sacar(valor);
    }
}
