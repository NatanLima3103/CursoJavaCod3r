package oo.composicao.exercicioOnze;

public class ExercicioOnzeTeste {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Natan", 8000);
        Funcionario f2 = new Funcionario("Aline", 3000);
        Funcionario f3 = new Funcionario("Lucca", 3500);
        Departamento d1 = new Departamento("TI", f1);

        d1.adicionarFuncionario(f2);
        d1.adicionarFuncionario(f3);

        System.out.println(d1.descrever());
        System.out.println(d1.calcularFolha());

        f1.salario = 9000;

        System.out.println(d1.descrever());
        System.out.println(d1.calcularFolha());
    }
}
