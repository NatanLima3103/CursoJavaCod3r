package oo.interfaces.exercicioDez;

public class Sms implements Canal{

    int limite;

    public Sms(int limite){
        this.limite = limite;
    }

    @Override
    public String getNome() {
        return "SMS";
    }

    @Override
    public boolean enviar(String mensagem) {
        if (mensagem.length() <= limite){
            return true;
        }
        return false;
    }

    @Override
    public int getCustoCentavos() {
        return 25;
    }
}
