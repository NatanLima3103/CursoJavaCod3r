package oo.interfaces.exercicioDez;

public class Push implements Canal{
    String dispositivo;
    boolean appInstalado;

    public Push(String dispositivo, boolean appInstalado){
        this.dispositivo = dispositivo;
        this.appInstalado = appInstalado;
    }

    @Override
    public String getNome() {
        return "Push " + dispositivo;
    }

    @Override
    public boolean enviar(String mensagem) {
        return appInstalado;
    }

    @Override
    public int getCustoCentavos() {
        return 5;
    }
}
