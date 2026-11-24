package stream.match.exercicioQuatro;

public class Inscricao {
    private String email;
    private int idade;
    private boolean pagamentoConfirmado;

    public Inscricao(String email, int idade, boolean pagamentoConfirmado){
        this.email = email;
        this.idade = idade;
        this.pagamentoConfirmado = pagamentoConfirmado;
    }

    public String getEmail(){
        return email;
    }

    public int getIdade(){
        return idade;
    }

    public boolean isPagamentoConfirmado(){
        return pagamentoConfirmado;
    }
}
