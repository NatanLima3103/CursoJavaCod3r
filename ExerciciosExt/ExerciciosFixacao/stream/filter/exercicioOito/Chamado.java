package stream.filter.exercicioOito;

public class Chamado {

    private String titulo;
    private String prioridade;
    private int horasAberto;
    private boolean resolvido;

    public Chamado(String titulo, String prioridade, int horasAberto, boolean resolvido){
        this.titulo = titulo;
        this.prioridade = prioridade;
        this.horasAberto = horasAberto;
        this.resolvido = resolvido;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getPrioridade(){
        return prioridade;
    }

    public int getHorasAberto(){
        return horasAberto;
    }

    public boolean isResolvido(){
        return resolvido;
    }
}
