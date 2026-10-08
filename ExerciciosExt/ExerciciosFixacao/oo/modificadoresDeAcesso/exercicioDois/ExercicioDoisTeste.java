package oo.modificadoresDeAcesso.exercicioDois;

public class ExercicioDoisTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Teclado", 100.0, 10);

        p1.vender(3);
        p1.vender(20);
        p1.vender(0);
        p1.reajustar(10);

        System.out.println(p1.resumo());

        System.out.println("Valor em estoque: " + p1.valorEmEstoque());
    }
}
