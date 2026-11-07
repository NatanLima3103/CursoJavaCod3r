package lambda.function.exercicioOito;

public class Cliente {

    private String nome;
    private String sobrenome;
    private String email;
    private String cpf;

    public Cliente(String nome, String sobrenome, String email, String cpf){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public String getEmail(){
        return email;
    }

    public String getCpf(){
        return cpf;
    }
}
