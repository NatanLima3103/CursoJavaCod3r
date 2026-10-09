package oo.modificadoresDeAcesso.exercicioCinco;

public class Pedido {

    private String cliente;
    private double valor;
    private boolean pago;

    public Pedido (String cliente, double valor){
        this.cliente = cliente;
        this.valor = valor;
        pago = false;
    }

    public void pagar(){
        if(pago == true){
            System.out.println("Pedido já pago: " + cliente);
        } else{
            pago = true;
        }
    }

    public double getValorSePago(){
        if(pago == true){
            return valor;
        }
        return 0.0;
    }

    public String resumo(){
        return cliente + " - R$ " + valor + " - pago: " + pago;
    }
}
