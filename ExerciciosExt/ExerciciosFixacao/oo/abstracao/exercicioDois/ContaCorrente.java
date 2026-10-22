package oo.abstracao.exercicioDois;

public class ContaCorrente extends Conta{

    public ContaCorrente(String titular){
        super(titular);
    }

    @Override
    double calcularTarifa(double valor) {
        return 3;
    }
}
