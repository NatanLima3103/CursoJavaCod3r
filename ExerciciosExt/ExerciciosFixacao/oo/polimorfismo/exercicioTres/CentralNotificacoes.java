package oo.polimorfismo.exercicioTres;

public class CentralNotificacoes {
    private int totalEnviadas;

    public void enviar(Notificacao n){
        System.out.println(n.montarMensagem());
        totalEnviadas++;
    }

    public int getTotalEnviadas() {
        return totalEnviadas;
    }
}