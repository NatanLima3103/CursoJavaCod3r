package oo.herenca.exercicioQuatro;

public class Notificacao {

    String texto;
    Notificacao(String texto){
        this.texto = texto;
    }

    String enviar(){

        return "Notificação: " + texto;
    }
}
