package stream.minmax.exercicioQuatro;

public class Celular {

    private String modelo;
    private int bateriaPct;
    private double preco;
    private boolean defeito;

    public Celular(String modelo, int bateriaPct, double preco, boolean defeito){
        this.modelo = modelo;
        this.bateriaPct = bateriaPct;
        this.preco = preco;
        this.defeito = defeito;
    }

    public String getModelo(){
        return modelo;
    }

    public int getBateriaPct(){
        return bateriaPct;
    }

    public double getPreco(){
        return preco;
    }

    public boolean isDefeito(){
        return defeito;
    }
}
