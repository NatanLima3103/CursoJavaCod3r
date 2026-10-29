package lambda.interfacesProprias.exercicioQuatro;

@FunctionalInterface
public interface Notificador {

    void enviar(String nome, String mensagem);
}
