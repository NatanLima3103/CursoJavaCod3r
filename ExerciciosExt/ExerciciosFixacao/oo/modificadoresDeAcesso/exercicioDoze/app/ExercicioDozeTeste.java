package oo.modificadoresDeAcesso.exercicioDoze.app;

import oo.modificadoresDeAcesso.exercicioDoze.acervo.Item;
import oo.modificadoresDeAcesso.exercicioDoze.acervo.Inventario;

public class ExercicioDozeTeste {
    public static void main(String[] args) {
        Item livro = new Item("Java Básico", 2, 100);
        Revista r = new Revista("Veja", 1, 200);
        Inventario inv = new Inventario();

        inv.emprestar(livro);
        inv.emprestar(livro);
        inv.emprestar(livro);
        inv.emprestar(r);

        System.out.println(livro.resumo());
        System.out.println(r.resumo());
        System.out.println(r.statusVenda());
    }
}
