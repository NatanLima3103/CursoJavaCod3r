package classe;

public class Aluno {

    String nome;
    double nota1;
    double nota2;
    double nota3;

    public double calcularMedia() {

        return (nota1 + nota2 + nota3) / 3;
    }

    public String status() {

        if (calcularMedia() >= 7) {
            return "Aprovado!!";
        } else if (calcularMedia() <= 6.9 && calcularMedia() >= 4.0) {
            return "Recuperação.";
        } else {
            return "Reprovado";
        }
    }
}
