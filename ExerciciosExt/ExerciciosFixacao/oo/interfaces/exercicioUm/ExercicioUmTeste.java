package oo.interfaces.exercicioUm;

import java.util.ArrayList;
import java.util.List;

public class ExercicioUmTeste {
    public static void main(String[] args) {
        List<Taxavel> lista = new ArrayList<>();

        Produto notebok = new Produto("Notebook", 3000);
        Produto mouse = new Produto("Mouse", 100);
        Servico consultoria = new Servico("Consultoria", 2000);

        lista.add(notebok);
        lista.add(mouse);
        lista.add(consultoria);

        double impostoTotal = 0;

        for (Taxavel t : lista){
            impostoTotal += t.calcularImposto();
        }

        System.out.println("O total dos impostos ficou em: " + impostoTotal);
    }
}
