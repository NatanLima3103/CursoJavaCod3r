package lambda.supplier.exercicioQuatro;

public class Cracha {

    private String tipo;
    private String cor;
    private boolean acessoTotal;

    public Cracha(String tipo, String cor){
        this.tipo = tipo;
        this.cor = cor;
        acessoTotal = false;
    }

    public String getTipo(){
        return tipo;
    }

    public String getCor(){
        return cor;
    }

    public boolean isAcessoTotal(){
        return acessoTotal;
    }

    public void setAcessoTotal(boolean acessoTotal){
        this.acessoTotal = acessoTotal;
    }
}
