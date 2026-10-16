package oo.polimorfismo.exercicioDois;

public class Desenvolvedor extends Funcionario{

    private int horaExtra;

    public Desenvolvedor(String nome, double salarioBase, int horaExtra){
        super(nome, salarioBase);
        this.horaExtra = horaExtra;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + horaExtra * 50.0;
    }
}
