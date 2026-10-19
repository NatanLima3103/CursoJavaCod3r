package oo.polimorfismo.exercicioTres;

import java.util.ArrayList;
import java.util.List;

public class ExercicioTresTeste {
    public static void main(String[] args) {
        CentralNotificacoes central = new CentralNotificacoes();

        List<Notificacao> notificacoes = new ArrayList<>();

        notificacoes.add(new Email("natan@email.com", "Fatura disponível"));
        notificacoes.add(new Sms("41999990000"));
        notificacoes.add(new WhatsapApp("Lima"));

        for (Notificacao n : notificacoes){
            central.enviar(n);
        }
        System.out.println("Total enviadas: " + central.getTotalEnviadas());
    }
}
