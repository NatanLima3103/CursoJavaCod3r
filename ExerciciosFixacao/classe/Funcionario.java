package classe;

public class Funcionario {

    String nome;
    double salario;
    String cargo;

    public double aumentarSalario(double percentual) {
        salario = salario + (salario *percentual / 100);
        return salario;
    }
}
