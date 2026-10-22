package lambda.exercicioUm;

public class ExercicioUmTeste {

    public static void main(String[] args) {

        CalculoDesconto desconto10porcento = valor -> valor * 0.9;

        CalculoDesconto abatimento20Reais = valor -> {
            double valorFinal = valor - 20;
            if (valorFinal < 0){
                return 0;
            }
            return valorFinal;
        };

        double valor = 200;
        System.out.println("Valor: " + valor + " | 10%: " + desconto10porcento.aplicar(valor) + " | -R$ 20: " + abatimento20Reais.aplicar(valor));

        valor = 50;
        System.out.println("Valor: " + valor + " | 10%: " + desconto10porcento.aplicar(valor) + " | -R$ 20: " + abatimento20Reais.aplicar(valor));

        valor = 15;
        System.out.println("Valor: " + valor + " | 10%: " + desconto10porcento.aplicar(valor) + " | -R$ 20: " + abatimento20Reais.aplicar(valor));
    }
}
