package classe;

public class JogoComConstrutorTeste {

    public static void main(String[] args) {

        JogoComConstrutor j1 = new JogoComConstrutor("R6", "Ubsoft", 2016, 9.0);
        System.out.println("Nome do jogo: " + j1.nome);
        System.out.println("Estúdio do jogo: " + j1.estudio);
        System.out.println("Ano de lançamento do jogo: " + j1.anoLancamento);
        System.out.println("Nota do jogo: " + j1.notaMetaCritic);

        System.out.println();

        JogoComConstrutor j2 = new JogoComConstrutor("Fifa 25", "EA", 2025, 8.5);
        System.out.println("Nome do jogo: " + j2.nome);
        System.out.println("Estúdio do jogo: " + j2.estudio);
        System.out.println("Ano de lançamento do jogo: " + j2.anoLancamento);
        System.out.println("Nota do jogo: " + j2.notaMetaCritic);
    }
}
