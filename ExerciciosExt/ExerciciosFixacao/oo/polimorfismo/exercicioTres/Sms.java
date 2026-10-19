package oo.polimorfismo.exercicioTres;

public class Sms extends Notificacao{
    Sms(String destinatario){
        super(destinatario);
    }

    @Override
    public String montarMensagem() {
        return "[SMS] Aviso para " + getDestinatario();
    }
}
