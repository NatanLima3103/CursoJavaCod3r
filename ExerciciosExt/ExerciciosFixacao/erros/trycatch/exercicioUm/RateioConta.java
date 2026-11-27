package erros.trycatch.exercicioUm;

public class RateioConta {

    static void dividirConta(int total, int pessoas) {
        try {
            int valorPorPessoa = total / pessoas;
            System.out.println("Cada um paga: R$ " + valorPorPessoa);
        } catch (ArithmeticException e) {
            System.out.println("Erro ao dividir: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("=== RATEIO 1 ===");
        dividirConta(240, 4);

        System.out.println("=== RATEIO 2 ===");
        dividirConta(240, 0);

        System.out.println("=== TESTE COM DOUBLE ===");
        try {
            double resultado = 240.0 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Caiu no catch");
        }

        System.out.println("Programa finalizado com sucesso");
    }
}
