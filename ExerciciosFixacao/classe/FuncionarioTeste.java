package classe;

import java.util.Scanner;

public class FuncionarioTeste {

    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        Funcionario f1 = new Funcionario();
        f1.nome = "Natan Lima";
        f1.salario = 10000.00;
        f1.cargo = "Estagiário";

        Funcionario f2 = new Funcionario();
        f2.nome = "Ketney Souza";
        f2.salario = 15000.00;
        f2.cargo = "Funcionária pública";

        System.out.println("Seu salário com aumento ficou: " + f1.aumentarSalario(10));
        System.out.println("Seu salário com aumento ficou: " + f2.aumentarSalario(10));
    }
}
