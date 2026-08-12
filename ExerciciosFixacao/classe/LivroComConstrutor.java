package classe;

public class LivroComConstrutor {

    String titulo;
    String autor;
    int numeroPaginas;
    boolean disponivel;

    LivroComConstrutor(String titulo, String autor, int numeroPaginas, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.disponivel = disponivel;
    }
}
