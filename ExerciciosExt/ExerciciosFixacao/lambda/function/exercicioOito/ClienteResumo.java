package lambda.function.exercicioOito;

public class ClienteResumo {

    private String nomeCompleto;
    private String email;

    public ClienteResumo(String nomeCompleto, String email){
        this.nomeCompleto = nomeCompleto;
        this.email = email;
    }

    public String getNomeCompleto(){
        return nomeCompleto;
    }

    public String getEmail(){
        return email;
    }
}
