package lambda.interfacesProprias.exercicioCinco;

public class ExercicioCincoTeste {
    public static void main(String[] args) {
        CalculoMulta multaSimples = emprestimo -> emprestimo.getDiasAtraso() * 1.5;
        CalculoMulta multaProgressiva = emprestimo -> {
            int dias = emprestimo.getDiasAtraso();
            double multa = emprestimo.getDiasAtraso() * 1.5;
            if (dias > 5){
                int diasExtra = dias - 5;
                multa += diasExtra * 1.5;
            }
            return multa;
        };

        Emprestimo emprestimo1 = new Emprestimo("Dom Casmurro", 3);
        Emprestimo emprestimo2 = new Emprestimo("Java Efetivo", 10);

        System.out.println(emprestimo1.getTitulo() + " | Atraso: " + emprestimo1.getDiasAtraso() + " dias | Simples: " + multaSimples.calcular(emprestimo1) + " | Progressiva: " + multaProgressiva.calcular(emprestimo1));
        System.out.println(emprestimo2.getTitulo() + " | Atraso: " + emprestimo2.getDiasAtraso() + " dias | Simples: " + multaSimples.calcular(emprestimo2) + " | Progressiva: " + multaProgressiva.calcular(emprestimo2));
    }
}
