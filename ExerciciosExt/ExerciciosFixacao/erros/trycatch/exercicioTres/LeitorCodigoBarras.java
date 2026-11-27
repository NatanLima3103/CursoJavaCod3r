package erros.trycatch.exercicioTres;

public class LeitorCodigoBarras {

    static void processarComRedeInterna(String[] codigos){
        for (String c : codigos){
            try {
                int codigo = Integer.parseInt(c);
                System.out.println("Item lido: " + codigo);
            } catch (NumberFormatException e ) {
                System.out.println("Item ignorado: " + c);
            }
        }
    }

    static void processarComRedeExterna(String[] codigos){
        try {
            for (String c : codigos){
                int codigo = Integer.parseInt(c);
                System.out.println("Item lido: " + codigo);
            }
        } catch (NumberFormatException e) {
            System.out.println("Lote abortado em: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String[] lote = {"101", "102", "ABC", "104", "105"};

        System.out.println("=== REDE DENTRO DO FOR ===");
        processarComRedeInterna(lote);

        System.out.println("=== REDE FORA DO FOR ===");
        processarComRedeExterna(lote);

        System.out.println("=== FIM DO TURNO ===");
    }
}
