package oo.modificadoresDeAcesso.exercicioDez.modelo;

public class Termonstato {
    private int temperatura;
    private int minimo;
    private int maximo;
    private int ajustes;

    public Termonstato(int minimo, int maximo){
        this.minimo = minimo;
        this.maximo = maximo;
        temperatura = minimo;
        ajustes = 0;
    }

    private boolean dentroDoLimite(int t){
        return t >= minimo && t <= maximo;
    }

    public void ajustar(int t){
        if(!dentroDoLimite(t)){
            System.out.println("Temperatura fora do limite: " + t);
        } else {
            temperatura = t;
            ajustes++;
        }
    }
    public String resumo(){
        return "Temperatura: " + temperatura + " - ajustes: " + ajustes;
    }
}
