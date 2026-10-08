package oo.modificadoresDeAcesso.exercicioTres;

public class Cofre {

    private int pin;
    private int tentativasErradas;
    private boolean bloqueado;
    private double valorGuardado;

    public Cofre(int pin, double valorGuardado){
        this.pin = pin;
        this.valorGuardado = valorGuardado;
    }

    private boolean pinCorreto(int tentativa){
        return tentativa == pin;
    }
    
    public void abrir(int tentativa){
        if (bloqueado == true){
            System.out.println("Cofre bloqueado");
        } else if (pinCorreto(tentativa)) {
            tentativasErradas = 0;
            System.out.println("Cofre aberto: R$ " + valorGuardado);
        } else {
            tentativasErradas = tentativasErradas + 1;
            System.out.println("PIN incorreto (tentativa " + tentativasErradas + " de 3)");
            if(tentativasErradas == 3){
                bloqueado = true;
                System.out.println("Cofre bloqueado");
            }
        }
    }

    public String resumo(){

        return "Cofre - bloqueado: " + bloqueado + " - tentativas erradas: " + tentativasErradas;
    }
}
