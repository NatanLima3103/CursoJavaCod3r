package oo.modificadoresDeAcesso.exercicioNove;

public class ExercicioNoveTeste {
    public static void main(String[] args) {
        Estoque e = new Estoque();

        e.cadastrar("MARTELO");
        e.cadastrar("SERRA");
        e.cadastrar("TRENA");
        e.cadastrar("MARTELO");

        e.movimentar("MARTELO", 10, true);
        e.movimentar("SERRA", 5, true);
        e.movimentar("SERRA", 8, false);
        e.movimentar("MARTELO", 4, false);
        e.movimentar("BROCA", 3, true);

        e.relatorio();
    }
}
