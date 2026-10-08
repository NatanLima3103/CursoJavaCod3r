package oo.herenca.exercicioDez;

import java.util.ArrayList;

public class ExercicioDezTeste {
    public static void main(String[] args) {
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();

        emprestimos.add(new Emprestimo("Java Básico", 4, 2.0));
        emprestimos.add(new EmprestimoEstudante("Algoritmos", 4, 2.0));
        emprestimos.add(new EmprestimoProfessor("Redes", 10, 2.0));
        emprestimos.add(new EmprestimoExpresso("Banco de Dados", 3));
        emprestimos.add(new EmprestimoExpresso("Python", 0));

        double total = 0;

        for(Emprestimo emprestimo : emprestimos){

            total = total + emprestimo.calcularMulta();
            System.out.println(emprestimo.resumo());
        }

        System.out.println("Total de multas: " + total);
    }
}
