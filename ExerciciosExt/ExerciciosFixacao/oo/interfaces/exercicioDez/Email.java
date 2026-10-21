package oo.interfaces.exercicioDez;

public class Email implements Canal{

    public Email(){

    }

    @Override
    public String getNome() {
        return "E-mail";
    }

    @Override
    public boolean enviar(String mensagem) {
        return true;
    }

    @Override
    public int getCustoCentavos() {
        return 10;
    }
}
