package arraylist;

import java.util.Scanner;

import java.util.ArrayList;

public class ExercicioDois {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<String> nomesProdutos = new ArrayList<>();

        nomesProdutos.add("Monitor");
        nomesProdutos.add("Teclado");
        nomesProdutos.add("Mouse");
        nomesProdutos.add("Fone");
        nomesProdutos.add("Notebook");

        System.out.println("Informe um produto para retirar da lista: ");
        String nomeInformado = entrada.nextLine();

        boolean removeuComSucesso = nomesProdutos.remove(nomeInformado);

        System.out.println("Removido com sucesso? " + removeuComSucesso);

        for (String nome : nomesProdutos){
            System.out.println(nome);
        }

        System.out.println("Ainda tem o produto? " + nomesProdutos.contains(nomeInformado));
    }
}
