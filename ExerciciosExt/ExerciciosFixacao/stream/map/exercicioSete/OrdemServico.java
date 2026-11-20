package stream.map.exercicioSete;

public class OrdemServico {

    private String placa;
    private String servico;
    private double valorPecas;
    private double valorMaoObra;

    public OrdemServico(String placa, String servico, double valorPecas, double valorMaoObra){
        this.placa = placa;
        this.servico = servico;
        this.valorPecas = valorPecas;
        this.valorMaoObra = valorMaoObra;
    }

    public String getPlaca(){
        return placa;
    }

    public String getServico(){
        return servico;
    }

    public double getValorPecas(){
        return valorPecas;
    }

    public double getValorMaoObra(){
        return valorMaoObra;
    }
}
