package lambda.consumer.exercicioSeis;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class CentralNotificacoes {

    public static void main(String[] args) {
        Cliente natan = new Cliente("Natan", "natan@email.com", "41 99999-0001");
        Cliente lima = new Cliente("Lima", "lima@email.com", "41 99999-0002");
        Cliente aline = new Cliente("Aline", "aline@email.com", "41 99999-0003");

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(natan);
        clientes.add(lima);
        clientes.add(aline);

        List<Consumer<Cliente>> acoes = new ArrayList<>();

        acoes.add(c -> System.out.println("Email para " + c.getEmail() + ": Olá, " + c.getNome()));
        acoes.add(c -> System.out.println("SMS para " + c.getTelefone() + ": Olá, " + c.getNome()));
        acoes.add(c -> System.out.println("[LOG] Notificação enviada a " + c.getNome()));

        clientes.forEach(cliente -> acoes.forEach(acao -> acao.accept(cliente)));
    }
}
