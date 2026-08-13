package classe;

public class FilmeComConstrutor {

    String titulo;
    String diretor;
    int duracaoMinutos;
    double avaliacao;

    FilmeComConstrutor(String titulo, String diretor, int duracaoMinutos, double avaliacao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracaoMinutos = duracaoMinutos;
        this.avaliacao = avaliacao;
    }
}