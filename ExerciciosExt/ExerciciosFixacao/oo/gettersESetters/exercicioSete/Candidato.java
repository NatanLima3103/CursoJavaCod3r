package oo.gettersESetters.exercicioSete;

public class Candidato {
    private String nome;
    private int idade;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        if (idade < 14){
            System.out.println("Abaixo do mínimo: " + nome);
        } else if (idade > 24){
            System.out.println("Acima do máximo: " + nome);
        } else {
            this.idade = idade;
        }
    }
}
