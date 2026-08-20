package classe;

public class LivroTeste {

    public static void main(String[] args) {

        Livro l1 = new Livro();
        l1.titulo = "O Homem mais rico da babilônia";
        l1.autor = "Natan Lima";
        l1.numeroPaginas = 159;
        l1.disponivel = true;

        Livro l2 = new Livro();
        l2.titulo = "Coritiba o maior do Paraná";
        l2.autor = "Vovô coxa";
        l2.numeroPaginas = 500;
        l2.disponivel = true;

        System.out.println("Título: " + l1.titulo);
        System.out.println("Autor: " + l1.autor);
        System.out.println("Número de páginas: " + l1.numeroPaginas);
        System.out.println("Disponível: " + l1.disponivel);

        System.out.println("Título: " + l2.titulo);
        System.out.println("Autor: " + l2.autor);
        System.out.println("Número de páginas: " + l2.numeroPaginas);
        System.out.println("Disponível: " + l2.disponivel);
    }
}
