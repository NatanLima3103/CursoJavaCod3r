package oo.herenca.exercicioQuatro;

public class NotificacaoUrgente extends Notificacao{

    NotificacaoUrgente(String texto){
        super(texto);
    }

    @Override
    String enviar() {
        return super.enviar() + " [URGENTE]";
    }
}
