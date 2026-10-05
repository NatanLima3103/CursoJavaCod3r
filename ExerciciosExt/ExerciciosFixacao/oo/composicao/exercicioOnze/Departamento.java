package oo.composicao.exercicioOnze;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

    String nome;
    Funcionario gerente;
    List<Funcionario> equipe = new ArrayList<>();

    Departamento(String nome, Funcionario gerente){

        this.nome = nome;
        this.gerente = gerente;
    }

    void adicionarFuncionario(Funcionario funcionario){

        equipe.add(funcionario);
    }

    double calcularFolha() {
        double total = gerente.salario;

        for(Funcionario funcionario : equipe){

            total = total + funcionario.salario;
        }

        return total;
    }

    String descrever() {

        return nome + ": gerente " + gerente.nome + ", " + equipe.size() + " funcionários na equipe";
    }
}
