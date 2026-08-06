import java.util.Scanner;

public class WhileCompraExercicio {

    public static void main (String[] args) {

        // Crie uma classe que:
        //
        // Pergunte ao usuário quantos itens ele vai comprar (número inteiro)
        // Usando um while, peça o preço de cada item, um de cada vez (double)
        // Vá somando o valor total da compra
        // Ao final do loop, exiba:
        // O valor total da compra
        // Se o total for maior que R$ 100,00, aplique e informe um desconto de 10% sobre o total (exiba o valor com desconto)
        // Se não passar de R$ 100,00, informe que não há desconto

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a quantidade dos itens que deseja comprar: ");
        int qtdProdutos = entrada.nextInt();
        double precoItem = 0;
        double soma = 0;
        int contador = qtdProdutos;

        while (contador != 0) {
            System.out.println("Informe o valor do item:");
            precoItem = entrada.nextDouble();
            soma = soma + precoItem;

        contador--;
        }

        System.out.println("A soma dos valores foi: " + soma);

        if (soma > 100) {
            double desconto = soma * 0.9;
            System.out.println("Você teve um desconto de 10%, valor total ficou:" + desconto);
        } else {
            System.out.println("O valor total ficou: " + soma);
        }

    }
}
