package oo.modificadoresDeAcesso.exercicioOnze.app;

import oo.modificadoresDeAcesso.exercicioOnze.base.Funcionario;

public class ExercicioOnzeTeste {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Natan", 3000.0, 1);
        Gerente g = new Gerente("Aline", 5000.0, 2);

        f.salario = 1;
        g.salario = 1;

        g.aumentar(10);
        g.aumentar(-5);

        System.out.println(g.resumo());
        System.out.println(f.resumo());
    }
}
