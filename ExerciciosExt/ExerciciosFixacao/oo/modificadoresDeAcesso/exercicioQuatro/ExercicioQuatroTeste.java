package oo.modificadoresDeAcesso.exercicioQuatro;

public class ExercicioQuatroTeste {
    public static void main(String[] args) {
        Carrinho c1 = new Carrinho(300.0);

        c1.adicionar("Mouse", 80.0);
        c1.adicionar("Teclado", 150.0);
        c1.adicionar("Mouse", 80.0);
        c1.adicionar("Monitor", 200.0);
        c1.adicionar("Cabo", -5.0);
        c1.remover("Mouse", 80.0);
        c1.remover("Webcam", 120.0);
        c1.adicionar("Monitor", 200.0);

        System.out.println(c1.resumo());
    }
}
