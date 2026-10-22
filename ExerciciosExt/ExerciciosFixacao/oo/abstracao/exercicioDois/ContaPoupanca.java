package oo.abstracao.exercicioDois;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(String titular){
        super(titular);
    }

    @Override
    double calcularTarifa(double valor) {
        return 0;
    }
}
