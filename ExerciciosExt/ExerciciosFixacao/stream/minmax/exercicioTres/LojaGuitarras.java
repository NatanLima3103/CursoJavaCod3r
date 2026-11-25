package stream.minmax.exercicioTres;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LojaGuitarras {

    public static void main(String[] args) {
        List<Guitarra> guitarras = new ArrayList<>();

        guitarras.add(new Guitarra("Les Paul", 12500.0, 1998));
        guitarras.add(new Guitarra("Stratocaster", 8900.0, 2015));
        guitarras.add(new Guitarra("Telecaster", 7200.0, 2008));
        guitarras.add(new Guitarra("SG Standard", 15400.0, 2021));

        Comparator<Guitarra> porPreco = (g1, g2) -> Double.compare(g1.getPreco(), g2.getPreco());
        Comparator<Guitarra> porPrecoInvertido = (g1, g2) -> Double.compare(g2.getPreco(), g1.getPreco());
        Comparator<Guitarra> porAno = (g1, g2) -> Integer.compare(g1.getAno(), g2.getAno());

        System.out.println("=== ESTOQUE DE GUITARRAS ===");
        Guitarra maisCara = guitarras.stream()
                .max(porPreco)
                .get();
        System.out.println("Mais cara: " + maisCara.getModelo() + " (R$ " + maisCara.getPreco() + ")");

        Guitarra maisBarata = guitarras.stream()
                .min(porPreco)
                .get();
        System.out.println("Mais barata: " + maisBarata.getModelo() + " (R$ " + maisBarata.getPreco() + ")");

        Guitarra testeInvertido = guitarras.stream()
                .max(porPrecoInvertido).get();
        System.out.println("Com comparador invertido, o max devolveu: " + testeInvertido.getModelo());

        Guitarra maisAntiga = guitarras.stream()
                .min(porAno)
                .get();
        System.out.println("Mais antiga: " + maisAntiga.getModelo() + " (" + maisAntiga.getAno() + ")");
    }

}
