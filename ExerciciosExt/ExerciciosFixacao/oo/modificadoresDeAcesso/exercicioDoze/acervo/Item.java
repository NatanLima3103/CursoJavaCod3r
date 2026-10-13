package oo.modificadoresDeAcesso.exercicioDoze.acervo;

public class Item {
    protected String titulo;
    protected int copias;
    private int codigoInterno;

    public Item(String titulo, int copias, int codigoInterno){
        this.titulo = titulo;
        this.copias = copias;
        this.codigoInterno = codigoInterno;
    }

    protected boolean temCopia(){
        return copias > 0;
    }

    public String resumo(){
        return titulo + " - cópias: " + copias;
    }
}
