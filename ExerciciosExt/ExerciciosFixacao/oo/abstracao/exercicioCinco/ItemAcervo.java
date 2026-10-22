package oo.abstracao.exercicioCinco;

public abstract class ItemAcervo {

    private String titulo;
    private boolean emprestado;

    public ItemAcervo(String titulo){
        this.titulo = titulo;
        emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public boolean emprestar(){
        if (emprestado){
            return false;
        }
        emprestado = true;
        return true;
    }

    public void devolver(){
        emprestado = false;
    }

    public abstract double calcularMulta(int diasAtraso);
}
