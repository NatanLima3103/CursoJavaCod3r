package oo.interfaces.exercicioSete;

public class Gerente implements Bonificavel{
    String nome;
    double salario;
    int subordinados;

    public Gerente(String nome, double salario, int subordinados){
        this.nome = nome;
        this.salario = salario;
        this.subordinados = subordinados;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double calcularBonus() {
        return (salario * 10 / 100) + (500 * subordinados);
    }
}
