package oo.abstracao.exercicioCinco;

public class Livro extends ItemAcervo {

    public Livro(String titulo){
        super(titulo);
    }

    @Override
    public String getTitulo() {
        return super.getTitulo();
    }

    @Override
    public boolean isEmprestado() {
        return super.isEmprestado();
    }

    @Override
    public boolean emprestar() {
        return super.emprestar();
    }

    @Override
    public void devolver() {
        super.devolver();
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return 2 * diasAtraso;
    }
}
