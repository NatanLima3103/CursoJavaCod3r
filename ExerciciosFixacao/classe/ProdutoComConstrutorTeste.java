package classe;

public class ProdutoComConstrutorTeste {

    public static void main (String[] args) {

        ProdutoComConstrutor p1 = new ProdutoComConstrutor("Symbol", -25000);

        System.out.println("Preço do produto: " + p1.preco);
    }
}
