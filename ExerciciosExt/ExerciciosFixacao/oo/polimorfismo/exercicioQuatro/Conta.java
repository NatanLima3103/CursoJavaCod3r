package oo.polimorfismo.exercicioQuatro;

public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean sacar(double valor){
        if (valor <= saldo){
            saldo = saldo - valor;
            return true;
        }
        return false;
    }
}
