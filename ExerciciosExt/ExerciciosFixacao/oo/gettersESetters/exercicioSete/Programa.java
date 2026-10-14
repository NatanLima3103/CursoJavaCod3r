package oo.gettersESetters.exercicioSete;

import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {
        Candidato natan = new Candidato();
        natan.setNome("Natan");
        natan.setIdade(16);

        Candidato lima = new Candidato();
        lima.setNome("Lima");
        lima.setIdade(12);

        Candidato aline = new Candidato();
        aline.setNome("Aline");
        aline.setIdade(30);

        Candidato fiori = new Candidato();
        fiori.setNome("Fiori");
        fiori.setIdade(24);

        Candidato lucca = new Candidato();
        lucca.setNome("Lucca");
        lucca.setIdade(14);

        ArrayList<Candidato> candidatos = new ArrayList<>();

        candidatos.add(natan);
        candidatos.add(lima);
        candidatos.add(aline);
        candidatos.add(fiori);
        candidatos.add(lucca);

        int somaIdade = 0;
        int contador = 0;

        for (Candidato c : candidatos){
            somaIdade = somaIdade + c.getIdade();
            System.out.println("Nome: " + c.getNome() + ", idade: " + c.getIdade());
            if (c.getIdade() > 0){
                contador++;
            }
        }

        double media = (double) somaIdade / contador;

        System.out.println("Número dos candidatos aceitos: " + contador);
        System.out.println("Soma das idades: " + somaIdade);
        System.out.println("A média das idades foi: " + media);
    }
}
