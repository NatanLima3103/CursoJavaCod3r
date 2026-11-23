package stream.filter.exercicioSeis;

public class Doador {

    private String nome;
    private String tipoSangue;
    private int idade;

    public Doador(String nome, String tipoSangue, int idade){
        this.nome = nome;
        this.tipoSangue = tipoSangue;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public String getTipoSangue(){
        return tipoSangue;
    }

    public int getIdade(){
        return idade;
    }
}
