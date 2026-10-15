package oo.gettersESetters.exercicioDez;

public class Reserva {
    private String hospede;
    private int noites;
    private double diaria;
    private boolean confirmada;

    public Reserva(String hospede, int noites, double diaria){
        this.hospede = hospede;
        setNoites(noites);
        setDiaria(diaria);
        confirmada = false;
    }

    public String getHospede(){
        return hospede;
    }

    public int getNoites(){
        return noites;
    }

    public void setNoites(int noites){
        if(noites >= 1 && noites <= 30){
            this.noites = noites;
        } else{
            System.out.println("Noites inválidas para " + hospede + ": valor ignorado.");
        }
    }

    public double getDiaria(){
        return diaria;
    }

    public void setDiaria(double diaria){
        if(diaria > 0){
            this.diaria = diaria;
        } else {
            System.out.println("Diária inválida para " + hospede + ": valor ignorado");
        }
    }

    public boolean isConfirmada(){
        return confirmada;
    }

    public void setConfirmada(boolean confirmada){
        this.confirmada = confirmada;
    }

    public double getTotal(){
        double noitesVsDiaria = noites * diaria;

        if (noites >= 7){
            return noitesVsDiaria - noitesVsDiaria * 10 /100;
        }
            return noitesVsDiaria;
    }
}
