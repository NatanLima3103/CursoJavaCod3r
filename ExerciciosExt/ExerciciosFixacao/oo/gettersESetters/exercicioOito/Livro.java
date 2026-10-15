package oo.gettersESetters.exercicioOito;

public class Livro {
    private String titulo;
    private int paginas;
    private double preco;

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public int getPaginas(){
        return paginas;
    }

    public void setPaginas(int paginas){
        this.paginas = paginas;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
}
