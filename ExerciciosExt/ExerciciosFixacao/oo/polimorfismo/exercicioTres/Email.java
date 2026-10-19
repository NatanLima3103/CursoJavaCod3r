package oo.polimorfismo.exercicioTres;

public class Email extends Notificacao{

    private String assunto;

    Email(String destinatario, String assunto){
        super(destinatario);
        this.assunto = assunto;
    }

    @Override
    public String montarMensagem() {
        return "[EMAIL] " + assunto + " -> " + getDestinatario();
    }
}
