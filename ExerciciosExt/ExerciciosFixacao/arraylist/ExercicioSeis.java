package arraylist;

import java.util.Scanner;

import java.util.ArrayList;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<String> nomesClientes = new ArrayList<>();

        nomesClientes.add("Natan");
        nomesClientes.add("Lima");
        nomesClientes.add("Aline");
        nomesClientes.add("Fiori");
        nomesClientes.add("Célia");

        boolean nomeEncontrado = false;

        System.out.println("Informe um nome, para verificar se está disponível na lista: ");
        String nomeInf = entrada.nextLine();

            nomeEncontrado = nomesClientes.contains(nomeInf);

        if (nomeEncontrado){
            System.out.println(nomeInf + " foi encontrado");
        } else
            System.out.println(nomeInf + " não foi encontrado");
    }
}
