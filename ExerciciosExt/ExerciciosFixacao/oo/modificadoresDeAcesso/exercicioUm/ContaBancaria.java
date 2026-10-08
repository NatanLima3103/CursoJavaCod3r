package oo.modificadoresDeAcesso.exercicioUm;

public class ContaBancaria {

    private String titular;
    private double saldo;

    ContaBancaria(String titular, double saldo){

        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo = saldo + valor;
        } else{
            System.out.println("Valor inválido");
        }
    }

    public void sacar(double valor){
        if(valor <= saldo){
            saldo = saldo - valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    public String resumo(){
        return titular + " - saldo: R$ " + saldo;
    }
}
