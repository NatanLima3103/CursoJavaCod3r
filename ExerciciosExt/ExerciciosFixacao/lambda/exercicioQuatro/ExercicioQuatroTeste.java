package lambda.exercicioQuatro;

public class ExercicioQuatroTeste {
    public static void main(String[] args) {
        Notificador porEmail = (nome, mensagem) -> System.out.println("[EMAIL] Para: " + nome + " | " + mensagem);

        Notificador porSms = (nome, mensagem) -> {
            System.out.println("[SMS] Para: " + nome);
            System.out.println("> " + mensagem);
        };

        String nome1 = "Natan";
        String nome2 = "Lima";
        String mensagem = "Seu pedido saiu para entrega";
        String mensagem2 = "Pagamento aprovado";

        porEmail.enviar(nome1, mensagem);
        porSms.enviar(nome1, mensagem);
        porEmail.enviar(nome2, mensagem2);
        porSms.enviar(nome2, mensagem2);

    }
}
