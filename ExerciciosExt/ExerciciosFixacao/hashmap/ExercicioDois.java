package hashmap;

import java.util.HashMap;

public class ExercicioDois {
    public static void main(String[] args) {
        HashMap<String, Double> produtos = new HashMap<>();

        produtos.put("Monitor", 1100.00);
        produtos.put("Mouse", 180.50);
        produtos.put("Teclado", 279.90);
        produtos.put("Headset", 153.00);

        for(String produto : produtos.keySet()) {
            System.out.println(produto + ": " + produtos.get(produto));
        }
    }
}
