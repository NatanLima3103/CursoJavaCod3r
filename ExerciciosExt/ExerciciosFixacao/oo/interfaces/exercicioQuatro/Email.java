package oo.interfaces.exercicioQuatro;

public class Email implements Validavel{
    String endereco;

    public Email(String endereco){
        this.endereco = endereco;
    }

    @Override
    public String getCampo() {
        return "E-mail";
    }

    @Override
    public boolean validar() {
        if (endereco.contains("@")){
            return true;
        }
        return false;
    }
}
