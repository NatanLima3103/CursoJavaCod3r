package poo.composicao.exercicioUm;

public class ClasseTeste {
    public static void main(String[] args) {

        Endereco endereco = new Endereco("Rua Teste", 123, "Curitiba");
        Cliente c1 = new Cliente("Natan", endereco);

        System.out.println("O cliente: " + c1.nome + " mora na " + c1.endereco.rua + ", " + c1.endereco.numCasa + " na cidade de " + c1.endereco.cidade + ".");
    }
}
