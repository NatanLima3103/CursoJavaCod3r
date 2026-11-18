package stream.criandoStream.exercicioTres;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Biblioteca {

    public static void main(String[] args) {

        List<String> generos = new ArrayList<>();

        generos.add("Romance");
        generos.add("Ficção");
        generos.add("Técnico");

        Stream<String> streamGeneros = generos.stream();

        streamGeneros.forEach(g -> System.out.println("Gênero: " + g));

        List<Livro> livros = new ArrayList<>();

        livros.add(new Livro("Dom Casmurro", "Machado de Assis", 256));
        livros.add(new Livro("O Hobbit", "Tolkien", 310));
        livros.add(new Livro("Clean Code", "Robert Martin", 464));

        Stream<Livro> streamlivros = livros.stream();

        streamlivros.forEach(l -> System.out.println(l.getTitulo() + " - " + l.getAutor() + " (" + l.getPaginas() + " páginas)"));

        Stream<Livro> streamParaContar = livros.stream();

        System.out.println("Total de livros: " + streamParaContar.count());
    }
}
