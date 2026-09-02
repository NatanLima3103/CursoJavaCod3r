package ExerciciosFixacao.reforco1.valorVsReferencia;

public class LivroTeste {

    public static void main(String[] args) {

        Livro l1 = new Livro("Dom Casmurro", "Machado de Assis");

        Livro l2 = l1;

        l2.titulo = "O homem mais rico da babilônia";

        System.out.println("l1.titulo: " + l1.titulo);
        System.out.println("l2.titulo: " + l2.titulo);
    }
}
