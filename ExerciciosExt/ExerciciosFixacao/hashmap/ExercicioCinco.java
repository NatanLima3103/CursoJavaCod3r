package hashmap;

import java.util.HashMap;
import java.util.Map;

public class ExercicioCinco {
    public static void main(String[] args) {
        HashMap<String, Integer> produtos = new HashMap<>();

        produtos.put("Monitor", 11);
        produtos.put("Mouse", 22);
        produtos.put("Teclado", 5);
        produtos.put("Notebook", 2);
        produtos.put("Fone", 36);

        int contadorEstoqueBaixo = 0;

        for(Map.Entry<String, Integer> produto : produtos.entrySet()) {

            System.out.println(produto.getKey() + ": " + produto.getValue());

            if(produto.getValue() < 10) {
                contadorEstoqueBaixo++;
            }
        }

        System.out.println("Produtos com estoque abaixo de 10: " + contadorEstoqueBaixo);
    }
}
