package classe;

public class PessoaComConstrutorTeste {

    public static void main(String[] args) {

        PessoaComConstrutor p1 = new PessoaComConstrutor("Natan");
        PessoaComConstrutor p2 = new PessoaComConstrutor("Aline");
        PessoaComConstrutor p3 = new PessoaComConstrutor("Kety");

        System.out.println("Total de pessoas criadas: " + PessoaComConstrutor.totalPessoas);
    }
}
