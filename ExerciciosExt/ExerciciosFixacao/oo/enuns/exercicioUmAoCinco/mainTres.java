package oo.enuns.exercicioUmAoCinco;

public class mainTres {

    public static void main(String[] args) {

        for(StatusPedido status : StatusPedido.values()){
            System.out.println(status + ":" + Descricao.descricao(status));
        }
    }
}
