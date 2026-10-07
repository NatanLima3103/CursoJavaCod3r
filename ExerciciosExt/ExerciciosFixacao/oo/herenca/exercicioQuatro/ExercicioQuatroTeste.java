package oo.herenca.exercicioQuatro;

import java.util.ArrayList;

public class ExercicioQuatroTeste {

    public static void main(String[] args) {
        ArrayList<Notificacao> notificacoes = new ArrayList<>();

        Notificacao n1 =new Notificacao("Reunião às 18h");
        Notificacao n2 = new NotificacaoUrgente("Servidor fora do ar");
        Notificacao n3 = new NotificacaoEmail("Certidão emitida", "natan@ssa.com");

        notificacoes.add(n1);
        notificacoes.add(n2);
        notificacoes.add(n3);

        for(Notificacao n : notificacoes){
            System.out.println(n.enviar());
        }
    }
}
