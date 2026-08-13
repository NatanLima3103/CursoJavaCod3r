package classe;

public class ContaBancariaComConstrutor {

    String titular;
    int numeroConta;
    double saldo;

    ContaBancariaComConstrutor(String titular, int numeroConta){

        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public void depositar(double valor) {

        saldo = saldo + valor;
    }
}
