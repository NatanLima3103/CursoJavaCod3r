package oo.modificadoresDeAcesso.exercicioOito;

public class Aluno {

    private String nome;
    private double nota;

    public Aluno(String nome){
        this.nome = nome;
        nota = 0.0;
    }

    public String getNome(){
        return nome;
    }

    public void lancarNota(double n){
        if(n < 0 || n > 10){
            System.out.println("Nota inválida: " + n);
        }else {
            nota = n;
        }
    }

    public boolean aprovado(){
        return nota >= 6.0;
    }

    public String resumo(){
        return nome + " - nota: " + nota;
    }
}
