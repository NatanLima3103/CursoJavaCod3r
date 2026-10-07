package oo.herenca.exercicioCinco;

public class ContaPoupanca extends ContaBancaria{

    double taxaMensal;

    ContaPoupanca(String titular, double saldo, double taxaMensal){
        super(titular, saldo);
        this.taxaMensal = taxaMensal;
    }

    void aplicarRendimento(){

        saldo = saldo + saldo * taxaMensal /100;
    }
}
