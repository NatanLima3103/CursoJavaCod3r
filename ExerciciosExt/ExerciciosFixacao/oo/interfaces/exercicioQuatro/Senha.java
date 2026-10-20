package oo.interfaces.exercicioQuatro;

public class Senha implements Validavel{
    String texto;

    public Senha(String texto){
        this.texto = texto;
    }

    @Override
    public String getCampo() {
        return "Senha";
    }

    @Override
    public boolean validar() {
        if (texto.length() >= 8){
            return true;
        }
        return false;
    }
}
