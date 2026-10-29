package lambda.consumer.exercicioOito;

public class Resumo {
    private int aprovados = 0;
    private int reprovados = 0;

    public void registrarAprovados() {
        aprovados++;
    }

    public void registrarReprovados() {
        reprovados++;
    }

    public int getAprovados() {
        return aprovados;
    }

    public int getReprovados() {
        return reprovados;
    }
}
