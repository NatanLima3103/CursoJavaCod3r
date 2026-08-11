package classe;

/*
 Exercício 3:
  Pegue a classe ContaBancaria do exercício 2 e adicione um método
    chamado depositar, que recebe um valor (parâmetro) e soma
   esse valor ao saldo do objeto. No teste, chame esse método algumas
    vezes e imprima o saldo depois de cada chamada.
*/

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
                double valor = entrada.nextDouble();
                pessoa1.depositar(valor);
                System.out.println("O valor em conta agora é: " + pessoa1.saldo);
                break;
            case "2":
                System.out.println("Você optou por não depositar...");
                break;
        }
    }
}
