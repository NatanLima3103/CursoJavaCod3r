package oo.modificadoresDeAcesso.exercicioSete;

public class Conta {

    private String titular;
    private double saldo;

    public Conta(String titular, double saldo){

        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if(valor <= 0){
            System.out.println("Valor inválido");
        } else {
            saldo = saldo + valor;
        }
    }

    public boolean sacar(double valor){
        if(valor <= 0 || valor > saldo){
            System.out.println("Saque recusado: " + titular);
            return false;
        }
        saldo = saldo - valor;
        return true;
    }

    public void transferir(Conta destino, double valor){
        if(sacar(valor)){
            destino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " para " + destino.titular);
        }else {
            System.out.println("Transferência cancelada");
        }
    }

    public String resumo(){
        return titular + " - saldo: R$ " + saldo;
    }
}
