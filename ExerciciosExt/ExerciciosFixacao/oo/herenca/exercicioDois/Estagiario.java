package oo.herenca.exercicioDois;

public class Estagiario extends Funcionario{

    String faculdade;

    Estagiario(String nome, double salarioBase, String faculdade){

        super(nome, salarioBase);
        this.faculdade = faculdade;
    }

    String getFaculdade(){

        return faculdade;
    }
}
