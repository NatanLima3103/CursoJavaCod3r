package oo.herenca.exercicioCinco;

public class ContaCorrente extends ContaBancaria {

    double limite;

    ContaCorrente(String titular, double saldo, double limite){
        super(titular, saldo);
        this.limite = limite;
    }

    @Override
    boolean sacar(double valor) {
        if(valor <= saldo + limite){
            saldo = saldo - valor;
            return true;
        }
        return false;
    }

    @Override
    String resumo() {
        return super.resumo() + " | Limite: " + limite;
    }
}
