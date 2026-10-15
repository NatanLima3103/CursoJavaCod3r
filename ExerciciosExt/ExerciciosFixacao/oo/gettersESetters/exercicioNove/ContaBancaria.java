package oo.gettersESetters.exercicioNove;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial){
        this.titular = titular;
        setSaldo(saldoInicial);
    }

    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        if(saldo >= 0 ){
            this.saldo = saldo;
        } else {
            System.out.println("Saldo inválido para " + titular + ": valor ignorado");
        }
    }
}
