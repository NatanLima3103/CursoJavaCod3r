package oo.herenca.exercicioDois;

public class Gerente extends Funcionario{

    double bonus;

    Gerente(String nome, double salarioBase, double bonus){

        super(nome, salarioBase);
        this.bonus = bonus;
    }

    double calcularTotal(){

        return salarioBase + bonus;
    }
}
