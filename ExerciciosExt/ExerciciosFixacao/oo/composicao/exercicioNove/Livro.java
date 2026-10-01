package oo.composicao.exercicioNove;

public class Livro {
    String titulo;
    boolean emprestado = false;

    Livro(String titulo){

        this.titulo = titulo;
    }

    void emprestar(){

        emprestado = true;
    }
}
