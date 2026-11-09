package lambda.supplier.exercicioUm;

import java.util.function.Supplier;

public class Totem {

    public static void main(String[] args) {
        Supplier<String> boasVindas = () -> "Bem-vindo à Padaria Pão Quente!";

        Supplier<Integer> totalMesas = () -> 12;

        Supplier<Double> precoCafe = () -> 4.5;

        System.out.println(boasVindas.get());
        System.out.println("Mesas no salão: " + totalMesas.get());
        System.out.println("Café: R$ " + precoCafe.get());

        // O lambda rodou duas vezes.
        System.out.println(boasVindas.get());
    }
}
