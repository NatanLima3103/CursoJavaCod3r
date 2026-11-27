package excecao.personalizadaB;

@SuppressWarnings("serial")
public class StringVaziaException extends Exception{

    private String nomedoAtributo;

    StringVaziaException(String nomeDoAtributo){
        this.nomedoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo '%s' está vazio.", nomedoAtributo);

    }
}
