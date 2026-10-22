package oo.abstracao.exercicioDois;

public abstract class Conta {
    String titular;
    double saldo;

    public Conta(String titular){
        this.titular = titular;
        saldo = 0;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    void depositar(double valor){
        saldo += valor;
    }

    abstract double calcularTarifa(double valor);

    boolean sacar(double valor){
        double total = valor + calcularTarifa(valor);

        if (saldo >= total){
            saldo -= total;
            return true;
        }
        return false;
    }
}
