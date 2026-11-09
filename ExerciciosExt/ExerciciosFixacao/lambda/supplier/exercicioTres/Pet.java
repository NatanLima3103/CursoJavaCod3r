package lambda.supplier.exercicioTres;

public class Pet {

    private String nome;
    private String especie;

    public Pet(String nome, String especie){
        this.nome = nome;
        this.especie = especie;
    }

    public String getNome(){
        return nome;
    }

    public String getEspecie(){
        return especie;
    }
}
