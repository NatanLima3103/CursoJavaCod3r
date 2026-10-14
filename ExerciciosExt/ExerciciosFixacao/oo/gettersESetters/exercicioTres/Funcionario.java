package oo.gettersESetters.exercicioTres;

public class Funcionario {
    private String nome;
    private double salario;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        if(salario > 0){
            this.salario = salario;
        } else {
            System.out.println("Salário inválido para " + nome + ": valor ignorado");
        }
    }
}
