package lambda.function.exercicioOito;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ExercicioOito {

    public static List<ClienteResumo> converterTodos(List<Cliente> clientes, Function<Cliente, ClienteResumo> regra){
         List<ClienteResumo> resultado = new ArrayList<>();

         for (Cliente cliente : clientes){
             resultado.add(regra.apply(cliente));
         }

         return resultado;
    }

    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente("Natan", "Lima", "NATAN@EMAIL.COM", "111.111.111-11"));
        clientes.add(new Cliente("Aline", "Fiori", "Aline@Email.com", "222.222.222-22"));
        clientes.add(new Cliente("Ketney", "Souza", "ketney@email.com", "333.333.333-33"));

        Function<Cliente, ClienteResumo> paraResumo = c -> new ClienteResumo(c.getNome() + " " + c.getSobrenome(), c.getEmail().toLowerCase());
        Function<ClienteResumo, String> formatarLinha = r -> r.getNomeCompleto() + " - " + r.getEmail();

        List<ClienteResumo> resumos = converterTodos(clientes, paraResumo);

        System.out.println("--- Clientes ---");
        resumos.forEach(r -> System.out.println(formatarLinha.apply(r)));

        System.out.println("Clientes: " + clientes.size() + " | Resumos: " + resumos.size());
    }
}
