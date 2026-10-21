package oo.interfaces.exercicioSete;

import java.util.ArrayList;
import java.util.List;

public class ExercicioSeteTeste {
    public static void main(String[] args) {
        List<Bonificavel> bonificaveis = new ArrayList<>();

        bonificaveis.add(new Gerente("Natan", 8000, 3));
        bonificaveis.add(new Vendedor("Lima", 20000));
        bonificaveis.add(new Vendedor("Aline", 6000));
        bonificaveis.add(new Estagiario("Fiori"));

        double totalBonus = 0;
        double maiorBonus = 0;
        String nomeMaior = "Não foi possível verificar";
        int qtdAcimaMil = 0;

        for (Bonificavel b : bonificaveis){
            double bonus = b.calcularBonus();
            System.out.println("Nome: " + b.getNome() + ", bônus: " + bonus);
            totalBonus += bonus;
            if (b.calcularBonus() > maiorBonus){
                maiorBonus = b.calcularBonus();
                nomeMaior = b.getNome();
            }

            if (b.calcularBonus() >= 1000){
                qtdAcimaMil++;
            }
        }

        System.out.println("Total a pagar: " + totalBonus);
        System.out.println("Maior bônus: " + nomeMaior + " (R$ " + maiorBonus + ")");
        System.out.println("Receberam 1000 ou mais: " + qtdAcimaMil);
    }
}
