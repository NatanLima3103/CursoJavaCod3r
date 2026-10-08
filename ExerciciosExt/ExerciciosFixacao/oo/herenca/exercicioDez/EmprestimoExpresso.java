package oo.herenca.exercicioDez;

public class EmprestimoExpresso extends Emprestimo{

    EmprestimoExpresso(String livro, int diasAtraso){

        super(livro, diasAtraso, 5.0);
    }

    @Override
    double calcularMulta() {
        if(diasAtraso > 0){

            return super.calcularMulta() + 10.0;
        }

        return super.calcularMulta();
    }
}
