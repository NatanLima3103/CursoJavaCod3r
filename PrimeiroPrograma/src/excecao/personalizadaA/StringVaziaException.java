package excecao.personalizadaA;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException{

    private String nomedoAtributo;

    StringVaziaException(String nomeDoAtributo){
        this.nomedoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo '%s' está vazio.", nomedoAtributo);

    }
}
