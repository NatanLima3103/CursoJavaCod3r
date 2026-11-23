package stream.filter.exercicioDez;

public class Imovel {

    private String endereco;
    private int quartos;
    private double aluguel;
    private boolean mobiliado;

    public Imovel(String endereco, int quartos, double aluguel, boolean mobiliado){
        this.endereco = endereco;
        this.quartos = quartos;
        this.aluguel = aluguel;
        this.mobiliado = mobiliado;
    }

    public String getEndereco(){
        return endereco;
    }

    public int getQuartos(){
        return quartos;
    }

    public double getAluguel(){
        return aluguel;
    }

    public boolean isMobiliado(){
        return mobiliado;
    }
}
