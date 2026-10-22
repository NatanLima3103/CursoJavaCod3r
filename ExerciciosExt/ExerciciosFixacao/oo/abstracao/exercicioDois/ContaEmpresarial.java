package oo.abstracao.exercicioDois;

public class ContaEmpresarial extends Conta{

    public ContaEmpresarial(String titular){
        super(titular);
    }

    @Override
    double calcularTarifa(double valor) {
        return valor * 1 / 100;
    }
}
