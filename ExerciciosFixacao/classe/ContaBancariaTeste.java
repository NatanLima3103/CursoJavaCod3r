package classe;

import java.util.Scanner;

public class ContaBancariaTeste {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ContaBancaria pessoa1 = new ContaBancaria();
        pessoa1.titular = "Natan Lima";
        pessoa1.numeroConta = 1234567;
        pessoa1.saldo = 2500.50;

        System.out.println("O saldo de " + pessoa1.titular + " é de: " + pessoa1.saldo);

        System.out.println("Deseja adicionar saldo em conta?");
        System.out.println("Digite 1 para sim ou 2 para não: ");
        String resposta = entrada.nextLine();
        //if (resposta == true){
        //    System.out.println("Qual o valor que deseja depositar? ");
        //    double valorDeposito = entrada.nextDouble();
        //} else {
        //    System.out.println("Perfeito, compreendido! Seu saldo continuará sendo: " + pessoa1.saldo);
        //}
        switch(resposta) {
            case "1":
                System.out.println("Quanto gostaria de adicionar? ");
                double valorParaAdicionar = entrada.nextDouble();
                double somaValores = (pessoa1.saldo = pessoa1.saldo + valorParaAdicionar);
                System.out.println("O valor em conta agora é: " + somaValores);
                break;
            case "2":
                System.out.println("Perfeito, compreendido! Seu saldo continuará sendo: " + pessoa1.saldo);
                break;
        }
    }
}
