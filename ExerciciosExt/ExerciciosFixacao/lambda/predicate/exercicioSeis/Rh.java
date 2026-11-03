package lambda.predicate.exercicioSeis;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Rh {

    public static List<Funcionario> filtrar(List<Funcionario> funcionarios, Predicate<Funcionario> regra){

        List<Funcionario> filtrados = new ArrayList<>();

        for (Funcionario f : funcionarios){
            if (regra.test(f)){
                filtrados.add(f);
            }
        }
        return filtrados;
    }

    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Natan", 4500.0, "TI"));
        funcionarios.add(new Funcionario("Lima", 7200.0, "RH"));
        funcionarios.add(new Funcionario("Aline", 9000.0, "TI"));
        funcionarios.add(new Funcionario("Fiori", 3800.0, "Financeiro"));

        List<Funcionario> maiorDeCincoMil = filtrar(funcionarios, f -> f.getSalario() > 5000);

        List<Funcionario> departamentoTi = filtrar(funcionarios, f -> f.getDepartamento().equals("TI"));

        System.out.println("Maior que R$ 5000,00: ");
        maiorDeCincoMil.forEach(f -> System.out.println(f.getNome() + " - " + f.getSalario()));

        System.out.println("Departamento do TI: ");
        departamentoTi.forEach(f -> System.out.println(f.getNome() + " - " + f.getSalario()));
    }
}
