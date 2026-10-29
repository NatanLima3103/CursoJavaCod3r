package lambda.interfacesProprias.exercicioSete;

public class ExercicioSeteTeste {
    static void avaliarTurma(double[] notas, CriterioNota criterio){
        for (double nota : notas){
            System.out.println("Nota: " + nota + ", Resultado: " + criterio.avaliar(nota));
        }
    }

    public static void main(String[] args) {
        double[] notas = {9.5, 7.0, 5.5, 3.0};

        System.out.println("--- Critério simples ---");
        avaliarTurma(notas, nota -> {
            if (nota >= 7){
                return "Aprovado";
            }
            return "Reprovado";
        });

        System.out.println("--- Critério detalhado ---");
        avaliarTurma(notas, nota -> {
            if (nota >= 9){
                return "Excelente";
            } else if (nota >= 7) {
                return "Aprovado";
            } else if (nota >= 5){
                return "Em recuperação";
            }
            return "Reprovado";
        });
    }
}
