package lambda.interfacesProprias.exercicioSeis;

public class ExercicioSeisTeste {

    static void reajustar(double[] precos, Reajuste regra){
        for (double preco : precos){
            System.out.println("Antes: " + preco + ", Depois: " + regra.aplicar(preco));
        }
    }

    public static void main(String[] args) {
        double[] precos = {10.0, 25.0, 6.0};

        System.out.println("--- Aumento de R$ 5 ---");
        reajustar(precos, preco -> preco + 5);

        System.out.println("--- Desconto de R$ 8 (mínimo R$ 1) ---");
        reajustar(precos, preco -> {
            double novoPreco = preco - 8;
            if (novoPreco <= 1){
                 return 1;
            }
            return novoPreco;
        });
    }
}
