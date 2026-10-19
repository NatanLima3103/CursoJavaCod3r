package oo.polimorfismo.exercicioTres;

public class WhatsapApp extends Notificacao{

    WhatsapApp(String destinatario){
        super(destinatario);
    }

    @Override
    public String montarMensagem() {
        return "[WHATSAPP] Olá, " + getDestinatario() + "!";
    }
}
