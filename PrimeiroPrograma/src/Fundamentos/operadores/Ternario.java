package Fundamentos.operadores;

public class Ternario {

    public static void main (String [] args) {

        double media = 5.5;

        String resultadoFinal = media >= 7.0 ?
                "aprovado" : "em recuparecação.";

        System.out.println("O aluno está " + resultadoFinal);

        double nota = 9.9;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultado = temDesconto ? "sim" : "não";

        System.out.println("Tem desconto? " + resultado);
    }
}
