package oo.modificadoresDeAcesso.exercicioOnze.base;

public class Funcionario {
    protected String nome;
    protected double salario;
    private int matricula;

    public Funcionario(String nome, double salario, int matricula){
        this.nome = nome;
        this.salario = salario;
        this.matricula = matricula;
    }

    public String resumo(){
        return nome + " - salário: R$ " + salario;
    }
}
