package classe;

public class FilmeComConstrutorTeste {

    public static void main (String[] args) {

        FilmeComConstrutor f1 = new FilmeComConstrutor("Carros", "Natan Lima", 90, 9.8 );

        System.out.println("Titulo: " + f1.titulo);
        System.out.println("Diretor: " + f1.diretor);
        System.out.println("Duração em minutos: " + f1.duracaoMinutos);
        System.out.println("Avaliação: " + f1.avaliacao);

        FilmeComConstrutor f2 = new FilmeComConstrutor("F1", "Aline Beatriz", 110, 9.5);
        System.out.println("Titulo: " + f2.titulo);
        System.out.println("Diretora: " + f2.diretor);
        System.out.println("Duração em minutos: " + f2.duracaoMinutos);
        System.out.println("Avaliação: " + f2.avaliacao);
    }
}
