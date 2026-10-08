package oo.herenca.exercicioDez;

public class EmprestimoProfessor extends Emprestimo{

    EmprestimoProfessor(String livro, int diasAtraso, double multaPorDia){

        super(livro, diasAtraso, multaPorDia);
    }

    @Override
    double calcularMulta() {
        return 00.0;
    }

    @Override
    String resumo() {
        return super.resumo() + " (isento)";
    }
}
