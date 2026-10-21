package oo.interfaces.exercicioNove;

public class ExercicioNoveTeste {
    public static void main(String[] args) {
        Compra compra = new Compra(200);

        compra.imprimir();

        compra.setDesconto(new DescontoPercentual(10));
        compra.imprimir();

        compra.setDesconto(new DescontoFixo(50));
        compra.imprimir();

        compra.setDesconto(new DescontoFixo(500));
        compra.imprimir();
    }
}
