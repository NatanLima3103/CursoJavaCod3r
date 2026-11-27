package excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends RuntimeException{

    private String nomedoAtributo;

    NumeroForaIntervaloException(String nomeDoAtributo){
        this.nomedoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo '%s' está fora do intervalo.", nomedoAtributo);

    }
}
