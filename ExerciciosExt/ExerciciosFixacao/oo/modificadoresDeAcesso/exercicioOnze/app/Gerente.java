package oo.modificadoresDeAcesso.exercicioOnze.app;

import oo.modificadoresDeAcesso.exercicioOnze.base.Funcionario;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario, int matricula){
        super(nome, salario, matricula);
    }

    public void aumentar(double percentual){
        if(percentual <= 0){
            System.out.println("Percentual inválido");
        } else {
            salario = salario + salario * percentual / 100;
        }
    }

    public String resumo(){
        return "Gerente " + nome + " - salário: R$ " + salario;
    }
}
