package oo.herenca.exercicioCinco;

import java.util.ArrayList;

public class ExercicioCincoTeste {

    public static void main(String[] args) {

        ContaBancaria c1 = new ContaBancaria("Natan", 5000.0);
        ContaCorrente c2 = new ContaCorrente("Lima", 2500.0, 1900.0);
        ContaPoupanca c3 = new ContaPoupanca("Aline", 1000.0, 1.0);

        System.out.println(c1.sacar(600));
        System.out.println(c2.sacar(450));
        c3.aplicarRendimento();

        ArrayList<ContaBancaria> contas = new ArrayList<>();

        contas.add(c1);
        contas.add(c2);
        contas.add(c3);

        for(ContaBancaria c : contas){

            System.out.println(c.resumo());
        }
    }
}
