package lambda.predicate.exercicioSete;

import lambda.predicate.exercicioSeis.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Biblioteca {

    public static int contar(List<Livro> livros, Predicate<Livro> regra){

        int contagemLivros = 0;

        List<Livro> filtrados = new ArrayList<>();

        for (Livro l : livros){
            if (regra.test(l)){
                contagemLivros++;
            }
        }
        return contagemLivros;
    }

    public static void main(String[] args) {

        List<Livro> livros = new ArrayList<>();

        livros.add(new Livro("Java Básico", 280, true));
        livros.add(new Livro("Python Avançado", 150, false));
        livros.add(new Livro("Algoritimos", 500, true));
        livros.add(new Livro("Redes", 90, true));
        livros.add(new Livro("Banco de Dados", 410, false));

        int disponiveis = contar(livros, l -> l.isDisponivel());
        int grandes = contar(livros, l -> l.getPaginas() > 300);
        int curtos = contar(livros, l -> l.getPaginas() < 100);

        System.out.println("Livros disponíveis: " + disponiveis);
        System.out.println("Livros com mais de 300 páginas: " + grandes);
        System.out.println("Livros com menos de 100 páginas: " + curtos);
    }
}
