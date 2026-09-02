package ExerciciosFixacao.reforco1.reforcosGerais;

import java.util.Scanner;

public class ReforcoWhileTentativasExercicio {

    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = entrada.nextInt();
        int numSecreto = 7;
        int numTentativas = 0;
        boolean continuarJogando = true;
        boolean acertou = false;

        while(continuarJogando && numTentativas < 4){

            if(num < numSecreto){
                System.out.println("Foi baixo");
                numTentativas++;
                if(numTentativas < 4){
                    System.out.println("Informe um novo número: ");
                    num = entrada.nextInt();
                }
            }else if(num > numSecreto) {
                System.out.println("Foi alto");
                numTentativas++;
                if(numTentativas < 4){
                    System.out.println("Informe um novo número: ");
                    num = entrada.nextInt();
                }
            }else{
                System.out.println("Você acertou!");
                acertou = true;
                continuarJogando = false;
                numTentativas++;
            }
        }

        if(!acertou){
            System.out.println("Seu número de tentativas expirou.");
        }
    }
}