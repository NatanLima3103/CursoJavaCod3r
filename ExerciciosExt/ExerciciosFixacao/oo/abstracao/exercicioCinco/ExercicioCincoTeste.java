package oo.abstracao.exercicioCinco;

public class ExercicioCincoTeste {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.registrar(new Livro("Dom Casmurro"));
        biblioteca.registrar(new Revista("Veja"));
        biblioteca.registrar(new Dvd("Matrix"));

        System.out.println(biblioteca.emprestar("Dom Casmurro"));
        System.out.println(biblioteca.emprestar("Dom Casmurro"));
        System.out.println(biblioteca.emprestar("Inexistente"));
        System.out.println(biblioteca.emprestar("Veja"));
        System.out.println(biblioteca.emprestar("Matrix"));

        System.out.println(biblioteca.contarDisponiveis());

        double totalMultas = 0;

        totalMultas += biblioteca.devolver("Dom Casmurro", 5);
        totalMultas += biblioteca.devolver("Veja", 20);
        totalMultas += biblioteca.devolver("Matrix", 4);

        System.out.println("Total de multas: " + totalMultas);
        System.out.println("Disponíveis: " + biblioteca.contarDisponiveis());
    }
}
