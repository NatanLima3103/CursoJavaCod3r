package oo.interfaces.exercicioOito;

public class Contrato implements Imprimivel, Assinavel{
    String titulo;
    double valor;

    public Contrato(String titulo, double valor){
        this.titulo = titulo;
        this.valor = valor;
    }

    @Override
    public String imprimir() {
        return "Imprimindo contrato: " + titulo + " (R$ " + valor + ")";
    }

    @Override
    public String assinar(String assinante) {
        return "Contrato " + titulo + " assinado por " + assinante;
    }
}
