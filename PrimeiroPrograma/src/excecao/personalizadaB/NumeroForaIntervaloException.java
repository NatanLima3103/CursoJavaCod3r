package excecao.personalizadaB;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends Exception{

    private String nomedoAtributo;

    NumeroForaIntervaloException(String nomeDoAtributo){
        this.nomedoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo '%s' está fora do intervalo.", nomedoAtributo);

    }
}
