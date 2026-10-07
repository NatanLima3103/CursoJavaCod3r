package oo.herenca.exercicioDois;

public class Funcionario {

    String nome;
    double salarioBase;

    Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    String apresentar(){

        return "Funcionário: " + nome + ", salário base: " + salarioBase;
    }
}
