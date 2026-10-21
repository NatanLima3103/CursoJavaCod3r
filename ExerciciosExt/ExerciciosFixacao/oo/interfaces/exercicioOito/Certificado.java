package oo.interfaces.exercicioOito;

public class Certificado implements Assinavel{
    String codigo;

    public Certificado(String codigo){
        this.codigo = codigo;
    }

    @Override
    public String assinar(String assinante) {
        return "Certificado " + codigo + " assinado por " + assinante;
    }
}
