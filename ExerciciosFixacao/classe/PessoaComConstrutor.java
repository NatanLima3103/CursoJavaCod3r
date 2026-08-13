package classe;

public class PessoaComConstrutor {

    String nome;
    static int totalPessoas = 0;

    PessoaComConstrutor(String nome){
        this.nome = nome;
        totalPessoas++;
    }
}
