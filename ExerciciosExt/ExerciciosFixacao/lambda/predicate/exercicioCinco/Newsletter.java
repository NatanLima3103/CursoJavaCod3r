package lambda.predicate.exercicioCinco;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Newsletter {

    public static List<String> filtrar(List<String> emails, Predicate<String> regra){
        List<String> emailsFiltrados = new ArrayList<>();
        for (String e : emails){
            if (regra.test(e)){
                emailsFiltrados.add(e);
            }
        }
        return emailsFiltrados;
    }

    public static void main(String[] args) {
        List<String> emails = new ArrayList<>();

        emails.add("natan@gmail.com");
        emails.add("lima.gmail.com");
        emails.add("aline@empresa.com.br");
        emails.add("fiori@site.org");
        emails.add("lucca@mail.com");

        List<String> comArroba = filtrar(emails, e -> e.contains("@"));

        List<String> terminaComCom = filtrar(emails, e -> e.endsWith(".com"));

        System.out.println("Com @:");
        comArroba.forEach(e -> System.out.println(e));

        System.out.println("Terminam com .com: ");
        terminaComCom.forEach(e -> System.out.println(e));
    }
}
