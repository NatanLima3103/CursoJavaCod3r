package oo.composicao.exercicioNove;

public class ExercicioNoveTeste {
    public static void main(String[] args) {

        Biblioteca b1 = new Biblioteca("Central");

        Livro l1 = new Livro("Java Básico");
        Livro l2 = new Livro("Python Avançado");
        Livro l3 = new Livro("Banco de Dados");

        b1.adicionarLivro(l1);
        b1.adicionarLivro(l2);
        b1.adicionarLivro(l3);

        System.out.println(b1.contarDisponiveis());
        System.out.println(b1.emprestarPrimeiro());
        System.out.println(b1.emprestarPrimeiro());
        System.out.println(b1.contarDisponiveis());
        System.out.println(b1.emprestarPrimeiro());
        System.out.println(b1.emprestarPrimeiro());
    }
}
