package oo.enuns.exercicioUmAoCinco;

public class mainDois {

    public static void main(String[] args) {

        for(StatusPedido status : StatusPedido.values()){

            System.out.println(status.ordinal() + " - " + status);
        }

        System.out.println(StatusPedido.values().length);
    }
}
