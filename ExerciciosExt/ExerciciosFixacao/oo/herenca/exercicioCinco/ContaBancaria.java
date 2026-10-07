package oo.herenca.exercicioCinco;

public class ContaBancaria {

    String titular;
    double saldo;

    ContaBancaria(String titular, double saldo){

        this.titular = titular;
        this.saldo = saldo;
    }

    boolean sacar(double valor){
        if(valor <= saldo){
            saldo = saldo - valor;
            return true;
        }
        return false;
    }

    String resumo(){

        return "Titular: " + titular + " | Saldo: " + saldo;
    }
}
