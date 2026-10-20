package oo.interfaces.exercicioQuatro;

public class Cpf implements Validavel{
    String numero;

    public Cpf(String numero){
        this.numero = numero;
    }

    @Override
    public String getCampo() {
        return "CPF";
    }

    @Override
    public boolean validar() {
        if (numero.length() == 11){
            return true;
        }
        return false;
    }
}
