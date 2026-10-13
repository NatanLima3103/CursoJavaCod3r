package oo.modificadoresDeAcesso.exercicioDez.app;

import oo.modificadoresDeAcesso.exercicioDez.modelo.Termonstato;

public class ExercicioDezTeste {
    public static void main(String[] args) {
        Termonstato t = new Termonstato(16, 30);

        t.ajustar(22);
        t.ajustar(35);
        t.ajustar(10);
        t.ajustar(30);

        System.out.println(t.resumo());
    }
}
