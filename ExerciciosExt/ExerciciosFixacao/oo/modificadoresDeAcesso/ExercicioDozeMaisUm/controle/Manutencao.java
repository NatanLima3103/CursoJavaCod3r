package oo.modificadoresDeAcesso.ExercicioDozeMaisUm.controle;

public class Manutencao {
    public void testar(Catraca c){
        c.liberarManual();
        c.liberarManual();

        System.out.println("Liberações: " + c.liberacoes);
    }
}
