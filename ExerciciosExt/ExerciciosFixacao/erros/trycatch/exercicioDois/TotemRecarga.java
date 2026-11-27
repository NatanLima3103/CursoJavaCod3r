package erros.trycatch.exercicioDois;

public class TotemRecarga {

    static void recarregar(String valorDigitado) {
        try {
            int valor = Integer.parseInt(valorDigitado);
            System.out.println("Recarga aprovada: R$ " + valor);
        } catch (NumberFormatException e) {
            System.out.println("Valor invalido. Detalhe: " + e.getMessage());
        }
    }

    static void recarregarComObjeto(String valorDigitado) {
        try {
            int valor = Integer.parseInt(valorDigitado);
            System.out.println("Recarga aprovada: R$ " + valor);
        } catch (NumberFormatException e) {
            System.out.println("Erro completo: " + e);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== TENTATIVA 1 ===");
        recarregar("50");

        System.out.println("=== TENTATIVA 2 ===");
        recarregar("50,00");

        System.out.println("=== TENTATIVA 3 ===");
        recarregar(" 50");

        System.out.println("=== IMPRIMINDO O OBJETO ===");
        recarregarComObjeto("abc");

        System.out.println("=== FIM ===");
    }
}
