package classe;

public class AlunoTeste {

    public static void main(String [] args) {

        Aluno al1 = new Aluno();
        al1.nome = "Natan";
        al1.nota1 = 8.5;
        al1.nota2 = 8.0;
        al1.nota3 = 9.0;

        System.out.println("A média final ficou em: " + al1.CalcularMedia());
    }
}
