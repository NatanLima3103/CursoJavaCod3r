package lambda.exercicioCinco;

public class Emprestimo {
    private String titulo;
    private int diasAtraso;

    public Emprestimo(String titulo, int diasAtraso){
        this.titulo = titulo;
        this.diasAtraso = diasAtraso;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDiasAtraso() {
        return diasAtraso;
    }
}
