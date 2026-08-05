public class TiposPrimitivosExercicio {

    // Crie variáveis para representar um produto de loja: nome (String),
    // preço (double), quantidade em estoque (int), se está em
    // promoção (boolean). Calcule e imprima o valor total em
    // estoque (preço × quantidade).

    public static void main (String[] args) {

        String nome = "Lajota";
        double preco = 15.0;
        int qtdEstoque = 25;
        boolean estaEmPromocao = true;

        double valorEstoque = (preco * qtdEstoque);

        System.out.println("O valor total disponível em estoque é: " + valorEstoque);

        if (estaEmPromocao) {
            System.out.println("O desconto é de 10%");
        }
    }
}
