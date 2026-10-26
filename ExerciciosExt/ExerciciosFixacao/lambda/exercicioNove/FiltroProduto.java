package lambda.exercicioNove;

@FunctionalInterface
public interface FiltroProduto {

    boolean aceitar(Produto produto);
}
