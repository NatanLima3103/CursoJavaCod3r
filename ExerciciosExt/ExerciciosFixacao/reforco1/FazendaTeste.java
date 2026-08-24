package ExerciciosFixacao.reforco1;

public class FazendaTeste {

    public static void main(String[] args) {

        Fazenda f1 = new Fazenda("Cuiabá", "Amagi");
        Fazenda f2 = new Fazenda("Londrina", "Soja Mais");

        System.out.println("Cidade da primeira fazenda: " + f1.cidade);
        System.out.println("Nome da primeira fazenda: " + f1.nome);
        System.out.println("Cidade da segunda fazenda: " + f2.cidade);
        System.out.println("Nome da segunda fazenda: " + f2.nome);
    }
}
