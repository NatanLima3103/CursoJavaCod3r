package oo.gettersESetters.exercicioOnze;

public class Entrega {
    private String destinatario;
    private int pesoKg;
    private double valorPorKg;
    private boolean entregue;

    public Entrega(String destinatario, int pesoKg, double valorPorKg){
        this.destinatario = destinatario;
        setPesoKg(pesoKg);
        setValorPorKg(valorPorKg);
    }

    public String getDestinatario(){
        return destinatario;
    }

    public int getPesoKg(){
        return pesoKg;
    }

    public void setPesoKg(int pesoKg){
        if(pesoKg >= 1 && pesoKg <= 30){
            this.pesoKg = pesoKg;
        } else {
            System.out.println("Peso inválido para " + destinatario +
                    ": valor ignorado");
        }
    }

    public double getValorPorKg(){
        return valorPorKg;
    }

    public void setValorPorKg(double valorPorKg){
        if (valorPorKg > 0){
            this.valorPorKg = valorPorKg;
        } else {
            System.out.println("Valor por kg inválido para " + destinatario
            + ": valor ignorado");
        }
    }

    public boolean isEntregue(){
        return entregue;
    }

    public void setEntregue(boolean entregue){
        this.entregue = entregue;
    }

    public double getFrete(){
        double calculo = 0;
        calculo = pesoKg * valorPorKg;

        if (pesoKg >= 10){
            calculo = calculo - calculo * 15 / 100;
        }

        return calculo;
    }
}
