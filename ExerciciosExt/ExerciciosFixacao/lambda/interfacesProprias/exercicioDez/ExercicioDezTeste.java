package lambda.interfacesProprias.exercicioDez;

import java.util.ArrayList;

public class ExercicioDezTeste {
    static void gerarRelatorio(String titulo, ArrayList<Aluno> alunos, FiltroAluno filtro, CalculoMensalidade calculo){

        System.out.println(titulo);

        double totalMensalidade = 0;

        for (Aluno aluno : alunos){
            if (filtro.aceitar(aluno)){
                double calculoMensalidade = calculo.calcular(aluno);
                totalMensalidade += calculoMensalidade;
                System.out.println(aluno.getNome() + " (" + aluno.getPlano() + ") | R$ " + calculoMensalidade);
            }
        }
        System.out.println("Total mensalidade: R$" + totalMensalidade);

    }

    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Natan", "Premium", 24));
        alunos.add(new Aluno("Lima", "Basico", 3));
        alunos.add(new Aluno("Aline", "Premium", 6));
        alunos.add(new Aluno("Fiori", "Basico", 18));

        gerarRelatorio("--- Todos | Mensalidade normal ---", alunos, aluno -> true, aluno -> {
            if (aluno.getPlano().equals("Premium")){
                return 180.0;
            }
            return 100.0;
        });

        gerarRelatorio("--- Premium | Com fidelidade ---", alunos,
                aluno -> aluno.getPlano().equals("Premium"),
                aluno -> {
                    double valor = 100.0;
                    if (aluno.getPlano().equals("Premium")) {
                        valor = 180.0;
                    }
                    if (aluno.getMesesDeCasa() >= 12) {
                        return valor * 0.9;
                    }
                    return valor;
                });
    }
}
