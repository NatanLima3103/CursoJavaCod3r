package oo.polimorfismo.exercicioQuatro;

import java.util.ArrayList;
import java.util.List;

public class ExercicioQuatroTeste {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();

        contas.add(new ContaCorrente("Natan", 1000.0));
        contas.add(new ContaPoupanca("Lima", 1000.0));
        contas.add(new ContaCorrente("Aline", 100.0));

        double valorTotalSaldo = 0;
        int contadorTrue = 0;

        for (Conta c : contas){
            boolean ok = c.sacar(300);
            System.out.println(c.getTitular() + ": saque ok = " + ok + ", saldo = " + c.getSaldo());

            valorTotalSaldo+=c.getSaldo();

            if (ok){
                contadorTrue++;
            }
        }

        System.out.println("Valor total dos saldos: " + valorTotalSaldo);
        System.out.println("Quantidade de saques: " + contadorTrue);
    }
}
