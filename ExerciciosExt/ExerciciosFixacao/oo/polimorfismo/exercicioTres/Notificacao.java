package oo.polimorfismo.exercicioTres;

public class Notificacao {
    private String destinatario;

    public Notificacao(String destinatario){
        this.destinatario = destinatario;
    }

    public String getDestinatario(){
        return destinatario;
    }

    public String montarMensagem(){
        return "Notificação para " + destinatario;
    }
}
