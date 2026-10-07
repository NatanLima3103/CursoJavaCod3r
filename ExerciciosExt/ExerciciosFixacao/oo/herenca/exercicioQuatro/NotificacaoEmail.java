package oo.herenca.exercicioQuatro;

public class NotificacaoEmail extends Notificacao{

    String destinatario;

    NotificacaoEmail(String texto, String destinatario){
        super(texto);
        this.destinatario = destinatario;
    }

    @Override
    String enviar() {
        return "Email para " + destinatario + ": " + texto;
    }
}