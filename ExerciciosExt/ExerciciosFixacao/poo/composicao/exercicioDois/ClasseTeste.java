package poo.composicao.exercicioDois;

public class ClasseTeste {

    public static void main(String[] args) {

        Categoria categoria = new Categoria("Industrializados", 1);
        Produto p1 = new Produto("Arroz", 4.99, categoria);

        System.out.println("O produto: " + p1.descricao + " está no corredor " + p1.categoria.corredor + " tal qual possui o nome de " + p1.categoria.nome);
    }
}
