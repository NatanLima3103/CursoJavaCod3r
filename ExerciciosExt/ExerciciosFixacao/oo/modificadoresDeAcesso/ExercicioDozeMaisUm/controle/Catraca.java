package oo.modificadoresDeAcesso.ExercicioDozeMaisUm.controle;

public class Catraca {
    int liberacoes;
    protected int passagens;
    private boolean travada;

    public Catraca(){
        liberacoes = 0;
        passagens = 0;
        travada = false;
    }

    void liberarManual(){
        liberacoes++;
        System.out.println("Liberação manual: " + liberacoes);
    }

    protected void registrar(){
        passagens++;
    }

    public void passar(){
        if (travada){
            System.out.println("Catraca travada");
        } else {
            registrar();
            System.out.println("Passagem: " + passagens);
        }
    }

    public void travar(){
        travada = true;
    }
}
