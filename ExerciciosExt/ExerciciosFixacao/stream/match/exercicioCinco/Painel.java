package stream.match.exercicioCinco;

public class Painel {

    private String codigo;
    private double geracaoKwh;
    private int anoInstalacao;
    private boolean ativo;

    public Painel(String codigo, double geracaoKwh, int anoInstalacao, boolean ativo){
        this.codigo = codigo;
        this.geracaoKwh = geracaoKwh;
        this.anoInstalacao = anoInstalacao;
        this.ativo = ativo;
    }

    public String getCodigo(){
        return codigo;
    }

    public double getGeracaoKwh(){
        return geracaoKwh;
    }

    public int getAnoInstalacao(){
        return anoInstalacao;
    }

    public boolean isAtivo(){
        return ativo;
    }
}
