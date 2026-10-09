package oo.modificadoresDeAcesso.exercicioSeis;

public class ExercicioSeisTeste {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Natan");
        j1.ganharPontos(60);
        j1.ganharPontos(50);
        j1.ganharPontos(0);
        j1.ganharPontos(150);
        j1.ganharPontos(100);
        j1.ganharPontos(100);

        j1.desativar();
        j1.ganharPontos(10);
        System.out.println(j1.resumo());

        j1.nivel(3);
        j1.verificarNivel();
    }
}
