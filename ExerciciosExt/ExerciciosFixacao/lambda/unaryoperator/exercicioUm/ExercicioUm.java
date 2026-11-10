package lambda.unaryoperator.exercicioUm;

import java.util.function.UnaryOperator;

public class ExercicioUm {

    public static void main(String[] args) {
        UnaryOperator<Double> adicionarEmbalagem = preco -> preco + 3.5;

        UnaryOperator<Double> aplicarCupom = preco -> preco - 5.0;

        UnaryOperator<String> padronizarNome = nome -> nome.trim().toUpperCase();

        double precoBase = 40.0;
        String nomeBruto = "  x-salada  ";

        System.out.println("Preço base: R$ " + precoBase);
        System.out.println("Com embalagem: R$ " + adicionarEmbalagem.apply(precoBase));
        System.out.println("Com cupom: R$ " + aplicarCupom.apply(precoBase));
        System.out.println("Nome padronizado: " + padronizarNome.apply(nomeBruto));
        System.out.println("Embalagem + cupom: R$ " + aplicarCupom.apply(adicionarEmbalagem.apply(precoBase)));

    }
}
