package oo.gettersESetters.exercicioCinco;

public class Membro {
    private String nome;
    private double mensalidade;
    private boolean ativo;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getMensalidade(){
        return mensalidade;
    }

    public void setMensalidade(double mensalidade){
        this.mensalidade = mensalidade;
    }

    public boolean isAtivo(){
        return ativo;
    }

    public void setAtivo(boolean ativo){
        this.ativo = ativo;
    }


}
