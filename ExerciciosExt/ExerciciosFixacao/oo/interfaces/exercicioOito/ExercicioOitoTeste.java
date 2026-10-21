package oo.interfaces.exercicioOito;

import java.util.ArrayList;
import java.util.List;

public class ExercicioOitoTeste {
    public static void main(String[] args) {

        Contrato aluguel = new Contrato("Aluguel", 1500);
        List<Imprimivel> filaImpressao = new ArrayList<>();

        filaImpressao.add(aluguel);
        filaImpressao.add(new Panfleto("Promoção de Natan"));

        List<Assinavel> filaAssinatura = new ArrayList<>();

        filaAssinatura.add(aluguel);
        filaAssinatura.add(new Certificado("CERT-01"));

        int impressos = 0;
        int assinados = 0;

        for (Imprimivel i : filaImpressao){
            System.out.println(i.imprimir());
            impressos++;
        }

        for (Assinavel a : filaAssinatura){
            System.out.println(a.assinar("Dr. Natan"));
            assinados++;
        }

        System.out.println("Impressos: " + impressos);
        System.out.println("Assinados: " + assinados);
    }
}
