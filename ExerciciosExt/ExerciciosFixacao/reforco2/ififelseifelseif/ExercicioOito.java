package reforco2.ififelseifelseif;

import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor da compra: ");
        double valorCompra = entrada.nextInt();

        System.out.println("Qual será a forma de pagamento?");
        System.out.println("Selecione '1' para pagamento à vista (Pagamentos à vista possuem 10% de desconto, aproveite!).");
        System.out.println("Selecione '2' para pagamento parcelado (Será acrescentado 5% ao valor da compra).");

        int pagamento = entrada.nextInt();
        double valorAVista = 0;
        double valorCredito = 0;

        if(pagamento == 1){
            valorAVista = valorCompra * 0.9;
            System.out.println("O valor da compra ficou em: " + valorAVista);
        } else if(pagamento == 2){
            valorCredito = alteração para commit

        }
    }
}
