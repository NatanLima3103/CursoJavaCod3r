package ExerciciosFixacao.reforco1;

import java.util.Scanner;

public class ReforcoWhileBooleanExercicio {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe sua senha: ");
        int senha = entrada.nextInt();
        int senhaUsuario = 1234;
        int tentativas = 0;
        boolean continuarTentando = true;

        while (continuarTentando && tentativas < 3) {


            if (senha == senhaUsuario){
                continuarTentando = false;
            }else{
                tentativas = tentativas + 1;
                if(tentativas < 3){
                    System.out.println("Senha incorreta! Tente novamente: ");
                    senha = entrada.nextInt();
                }
            }
        }
        if (continuarTentando == false){

            System.out.println("Entrou no sistema");
        }else{

            System.out.println("Uso bloqueado, 3 tentativas utilizadas");
        }
    }
}
