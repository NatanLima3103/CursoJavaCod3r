package lambda.interfacesProprias.exercicioTres;

public class ExercicioTresTeste {
    public static void main(String[] args) {
        RegraValidacao senhaValida = texto -> texto.length() >= 8 && !texto.contains(" ");
        RegraValidacao emailValido = texto -> texto.contains("@") && texto.contains(".");

        String senhaTeste1 = "abc123";
        String senhaTeste2 = "minhaSenha1";
        String senhaTeste3 = "minha senha 1";
        String emailTeste1 = "ntn@gmail.com";
        String emailTeste2 = "ntngmail.com";
        String emailTeste3 = "ntn@gmail";

        System.out.println("Senha: " + senhaTeste1 + " | Válida: " + senhaValida.validar(senhaTeste1));
        System.out.println("Senha: " + senhaTeste2 + " | Válida: " + senhaValida.validar(senhaTeste2));
        System.out.println("Senha: " + senhaTeste3 + " | Válida: " + senhaValida.validar(senhaTeste3));

        System.out.println("Senha: " + emailTeste1 + " | Válida: " + emailValido.validar(emailTeste1));
        System.out.println("Senha: " + emailTeste2 + " | Válida: " + emailValido.validar(emailTeste2));
        System.out.println("Senha: " + emailTeste3 + " | Válida: " + emailValido.validar(emailTeste3));
    }
}
