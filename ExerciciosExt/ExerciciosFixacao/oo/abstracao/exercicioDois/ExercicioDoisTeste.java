package oo.abstracao.exercicioDois;

import java.util.ArrayList;
import java.util.List;

public class ExercicioDoisTeste {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();

        contas.add(new ContaCorrente("Natan"));
        contas.add(new ContaPoupanca("Lima"));
        contas.add(new ContaEmpresarial("Aline"));

        for (Conta conta : contas){
            conta.depositar(1000);
        }

        for (Conta conta : contas){
            boolean ok = conta.sacar(200);

            if (ok){
                System.out.println(conta.titular + ": aprovado | saldo: " + conta.saldo);
            } else {
                System.out.println(conta.titular + ": negado | saldo: " + conta.saldo);
            }
        }

        int negados = 0;

        for (Conta conta : contas){
            boolean ok = conta.sacar(800);

            if (ok){
                System.out.println(conta.titular + ": aprovado | saldo: " + conta.saldo);
            } else {
                negados++;
                System.out.println(conta.titular + ": negado | saldo: " + conta.saldo);
            }
        }
        System.out.println("Negados: " + negados);
    }
}
