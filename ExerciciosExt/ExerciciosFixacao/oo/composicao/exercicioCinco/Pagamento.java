package oo.composicao.exercicioCinco;

public class Pagamento {

    double valor;
    boolean pago = false;

    Pagamento(double valor){

        this.valor = valor;
    }

    boolean pagar(double valorRecebido){
        if(valorRecebido >= valor){
            pago = true;
            return true;
        } else {
            return false;
        }
    }
}
