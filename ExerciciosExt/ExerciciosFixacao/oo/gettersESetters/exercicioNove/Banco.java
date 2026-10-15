package oo.gettersESetters.exercicioNove;

import java.util.ArrayList;

public class Banco {
    public static void main(String[] args) {

        ContaBancaria natan = new ContaBancaria("Natan", 1500.0);
        ContaBancaria lima = new ContaBancaria("Lima", -200);
        ContaBancaria aline = new ContaBancaria("Aline", 800.0);
        ContaBancaria fiori = new ContaBancaria("Fiori", 800.0);
        ContaBancaria lucca = new ContaBancaria("Lucca", 0.0);

        ArrayList<ContaBancaria> contas = new ArrayList<>();

        contas.add(natan);
        contas.add(lima);
        contas.add(aline);
        contas.add(fiori);
        contas.add(lucca);

        fiori.setSaldo(-50);

        double somaTodosValores = 0;
        double somaPositivos = 0;
        int contagemPositivos = 0;

        for (ContaBancaria c : contas){
            System.out.println("Titular: " + c.getTitular() + ", saldo: " + c.getSaldo());

            somaTodosValores = somaTodosValores + c.getSaldo();

            if (c.getSaldo() > 0){
            somaPositivos = somaPositivos + c.getSaldo();
                contagemPositivos++;
            }
        }

        double media = (double) somaPositivos / contagemPositivos;

        System.out.println("Soma dos saldos: " + somaTodosValores);
        System.out.println("Quantidade de contas com saldo positivo: " + contagemPositivos);
        System.out.println("A média somente dos positivos: " + media);
    }
}
