package oo.polimorfismo.exercicioCinco;

public class Forma {
    private String nome;

    public Forma(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double calcularArea(){
        return 0.0;
    }

    public String descrever(){
        return nome + " | área: " + calcularArea();
    }
}
