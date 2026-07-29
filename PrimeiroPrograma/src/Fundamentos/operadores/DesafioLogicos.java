package Fundamentos.operadores;

public class DesafioLogicos {

    public static void main (String[] args) {

        //Trabalho na terça (V ou F)
        //Trabalho na quinta (V ou F)
        //Se ambos os trabalhos derem certo, você comprará uma TV de 50 polegadas,
        //se somente um dos trabalhos derem certo, comprará uma TV de 32 polegadas,
        //Ou comprando qualquer modelo de TV, vocês tomarão sorvete juntos, para comemorar a compra da TV.
        //Se nenhum dos trabalhos derem certo, a família ficará em casa.
        //Ficará mais saudável se não tomar sorvete.

        boolean trabalho1 = false;
        boolean trabalho2 = false;

        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;

        // Operador Unário!
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou TV 50\"?" + comprouTv50);
        System.out.println("Comprou TV 32\"?" + comprouTv32);
        System.out.println("Comprou sorvete?" + comprouSorvete);

        System.out.println("Mais saudável?" + maisSaudavel);


    }
}
