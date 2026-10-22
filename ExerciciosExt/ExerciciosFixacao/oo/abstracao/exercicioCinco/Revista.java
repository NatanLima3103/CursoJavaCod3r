package oo.abstracao.exercicioCinco;

public class Revista extends ItemAcervo{

    public Revista(String titulo){

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
        double calculo = 1 * diasAtraso;
        if (calculo > 10){
            calculo = 10;
            return calculo;
        }
        return calculo;
    }
}
