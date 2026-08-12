package classe;

public class LivroComConstrutorTeste {

    public static void main (String[] args) {

        LivroComConstrutor l1 = new LivroComConstrutor("Homem mais rico da babilônia", "Natan Lima", 132, true);

        System.out.println("Título: " + l1.titulo);
        System.out.println("Autor: " + l1.autor);
        System.out.println("Número de páginas: " + l1.numeroPaginas);
        System.out.println("Disponível: " + l1.disponivel);


        LivroComConstrutor l2 = new LivroComConstrutor("Nome aleatório", "Natan Lima", 250, true);

        System.out.println("Título: " + l2.titulo);
        System.out.println("Autor: " + l2.autor);
        System.out.println("Número de páginas: " + l2.numeroPaginas);
        System.out.println("Disponível: " + l2.disponivel);
    }
}
