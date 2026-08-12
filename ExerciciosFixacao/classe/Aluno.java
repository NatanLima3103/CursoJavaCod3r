package classe;

public class Aluno {

    String nome;
    double nota1;
    double nota2;
    double nota3;

    public double CalcularMedia() {

        return (nota1 + nota2 + nota3) / 3;
    }
}
