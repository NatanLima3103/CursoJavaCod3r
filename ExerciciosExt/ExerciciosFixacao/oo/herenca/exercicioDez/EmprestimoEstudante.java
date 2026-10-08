package oo.herenca.exercicioDez;

public class EmprestimoEstudante extends Emprestimo{

    EmprestimoEstudante(String livro, int diasAtraso, double multaPorDia){

        super(livro, diasAtraso, multaPorDia);
    }

    @Override
    double calcularMulta() {
        return super.calcularMulta() - super.calcularMulta() * 50 / 100;
    }
}
