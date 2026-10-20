package oo.interfaces.exercicioUm;

public class Servico implements Taxavel{
    String descricao;
    double valor;

    public Servico(String descricao, double valor){
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public double calcularImposto() {
        return valor * 5 / 100;
    }
}
