package stream.filter.exercicioQuatro;

public class Servidor {

    private String nome;
    private int usoCpu;
    private boolean online;

    public Servidor(String nome, int usoCpu, boolean online){
        this.nome = nome;
        this.usoCpu = usoCpu;
        this.online = online;
    }

    public String getNome(){
        return nome;
    }

    public int getUsoCpu(){
        return usoCpu;
    }

    public boolean isOnline(){
        return online;
    }
}
