package classe;

public class AlunoTeste {

    public static void main(String [] args) {

        Aluno al1 = new Aluno();
        al1.nome = "Natan";
        al1.nota1 = 4.5;
        al1.nota2 = 3.0;
        al1.nota3 = 2.0;

        System.out.println("A média final ficou em: " + al1.calcularMedia());
        System.out.println("Segue seu status: " + al1.status());
    }
}
