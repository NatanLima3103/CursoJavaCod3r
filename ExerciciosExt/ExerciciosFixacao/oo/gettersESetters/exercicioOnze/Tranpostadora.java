package oo.gettersESetters.exercicioOnze;

import java.util.ArrayList;

public class Tranpostadora {
    public static void main(String[] args) {
        Entrega natan = new Entrega("Natan", 4, 20.0);
        Entrega lima = new Entrega("Lima", 10, 30.0);
        Entrega aline = new Entrega("Aline", 31, 12.0);
        Entrega fiori = new Entrega("Fiori", 6, -5);
        Entrega lucca = new Entrega("Lucca", 20, 40.0);

        natan.setEntregue(true);
        lima.setEntregue(true);
        aline.setEntregue(true);

        ArrayList<Entrega> entregas = new ArrayList<>();

        entregas.add(natan);
        entregas.add(lima);
        entregas.add(aline);
        entregas.add(fiori);
        entregas.add(lucca);

        double somaFretesEntregues = 0;
        int contadorPendetes = 0;
        double valorMaiorFrete = 0;
        String destinatarioMaiorFrete = "Não foi possível verificar";

        for (Entrega e : entregas){
            if (e.isEntregue()){
                somaFretesEntregues = somaFretesEntregues + e.getFrete();
            }

            if (!e.isEntregue()){
                contadorPendetes++;
            }

            if (e.getFrete() > valorMaiorFrete){
                valorMaiorFrete = e.getFrete();
                destinatarioMaiorFrete = e.getDestinatario();
            }

            System.out.println("Destinatário: " + e.getDestinatario() + ", peso por KG: " +
                    e.getPesoKg() + ", frete: " + e.getFrete() + ", entregue?" + e.isEntregue());
        }
        System.out.println("Receita das entregues: " + somaFretesEntregues);
        System.out.println("Quantidade de pendentes: " + contadorPendetes);
        System.out.println("Destinatário " + destinatarioMaiorFrete + ", maior valor frete: "
                + valorMaiorFrete);
    }
}