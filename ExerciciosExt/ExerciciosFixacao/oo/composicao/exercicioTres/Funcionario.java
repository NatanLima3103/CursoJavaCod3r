package oo.composicao.exercicioTres;

public class Funcionario {

    String nome;
    Cracha cracha;

    Funcionario(String nome, Cracha cracha){

        this.nome = nome;
        this.cracha = cracha;
    }

    String entrar(){

        if (cracha.ativo){
            return nome + " entrou. Crachá " + cracha.numero + " liberado.";
        } else {
            return nome + " barrado, Crachá " + cracha.numero + " bloqueado.";
        }
    }
}
