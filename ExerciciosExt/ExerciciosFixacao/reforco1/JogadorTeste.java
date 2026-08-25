package ExerciciosFixacao.reforco1;

public class JogadorTeste {

    public static void main(String [] args) {

        Jogador j1 = new Jogador("Tinga", 4);
        Jogador j2 = new Jogador("Pedro Rocha", 7);
        Jogador j3 = new Jogador("Bruno melo", 2);
        Jogador j4 = new Jogador("Jacy", 9);

        System.out.println("Jogador e sua respectiva pontuação: " + j1.nome + " " + j1.pontuacao);
        System.out.println("Jogador e sua respectiva pontuação: " + j2.nome + " " +j2.pontuacao);
        System.out.println("Jogador e sua respectiva pontuação: " + j3.nome + " " +j3.pontuacao);
        System.out.println("Jogador e sua respectiva pontuação: " + j4.nome + " " +j4.pontuacao);

        System.out.println("Maior pontuação: " + Jogador.maiorPontuacao);
    }
}
