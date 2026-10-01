package oo.composicao.exercicioNove;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    String nome;
    List<Livro> livros = new ArrayList<>();

    Biblioteca(String nome){

        this.nome = nome;
    }

    void adicionarLivro(Livro livro){

        livros.add(livro);
    }

    int contarDisponiveis(){
        int contador = 0;

        for(Livro livro : livros){

            if(livro.emprestado == false){
                contador++;
            }
        }
        return contador;
    }

    String emprestarPrimeiro(){

        for (Livro livro : livros){
            if(!livro.emprestado){
                livro.emprestar();
                return "Emprestado " + livro.titulo;
            }
        }
        return "Nenhum livro disponível.";
    }
}
