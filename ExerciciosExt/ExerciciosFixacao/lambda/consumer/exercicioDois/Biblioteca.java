package lambda.consumer.exercicioDois;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Biblioteca {
    public static void main(String[] args) {

        ArrayList<Livro> livros = new ArrayList<>();

        livros.add(new Livro("Java Básico", "Natan", 250));
        livros.add(new Livro("Algoritimos na Prática", "Lima", 420));
        livros.add(new Livro("Redes Simplificado", "Aline", 180));
        livros.add(new Livro("Banco de Dados", "Fiori", 350));

        Consumer<Livro> exibir = livro ->
                System.out.println(livro.titulo + " - " + livro.autor + " ( " + livro.paginas + " páginas)");

        Consumer<Livro> avisarLongo = livro -> {
            if (livro.paginas > 300){
                System.out.println("Livro longo: " + livro.titulo);
            }
        };

        livros.forEach(exibir);

        livros.forEach(avisarLongo);

        livros.forEach(livro ->  {
            System.out.println("Autores: " + livro.autor);
        });
    }
}
