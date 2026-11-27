package erros.trycatch.exercicioQuatro;

public class ImportadorNotas {

    static void importar(String linha) {
        try {
            String[] partes = linha.split(";");
            String nome = partes[0];
            int total = Integer.parseInt(partes[1]);
            int provas = Integer.parseInt(partes[2]);
            int media = total / provas;

            System.out.println("Aluno: " + nome + " | Media: " + media);
        } catch (NumberFormatException e) {
            System.out.println("Valor nao numerico na linha: " + linha);
        } catch (ArrayIndexOutOfBoundsException e ) {
            System.out.println("Linha incompleta: " + linha);
        } catch (Exception e) {
            System.out.println("Outro erro (" + e.getMessage() + ") na linha: " + linha);
        }
    }

    public static void main(String[] args) {
        importar("Ana;180;2");
        importar("Bruno;dez;2");
        importar("Carlos;180");
        importar("Diana;180;0");

        System.out.println("=== FIM DA IMPORTACAO ===");
    }
}
